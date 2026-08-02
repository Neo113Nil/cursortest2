package javazoom.jl.converter;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.Obuffer;

/* loaded from: classes9.dex */
public class Converter {

    public interface ProgressListener {
        public static final int UPDATE_CONVERT_COMPLETE = 2;
        public static final int UPDATE_FRAME_COUNT = 1;

        boolean converterException(Throwable th);

        void converterUpdate(int i, int i2, int i3);

        void decodedFrame(int i, Header header, Obuffer obuffer);

        void parsedFrame(int i, Header header);

        void readFrame(int i, Header header);
    }

    protected int countFrames(InputStream inputStream) {
        return -1;
    }

    public synchronized void convert(String str, String str2) throws JavaLayerException {
        convert(str, str2, (ProgressListener) null, (Decoder.Params) null);
    }

    public synchronized void convert(String str, String str2, ProgressListener progressListener) throws JavaLayerException {
        convert(str, str2, progressListener, (Decoder.Params) null);
    }

    public void convert(String str, String str2, ProgressListener progressListener, Decoder.Params params) throws JavaLayerException {
        if (str2.length() == 0) {
            str2 = null;
        }
        try {
            InputStream openInput = openInput(str);
            convert(openInput, str2, progressListener, params);
            openInput.close();
        } catch (IOException e) {
            throw new JavaLayerException(e.getLocalizedMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x00ab, IOException -> 0x00ad, TRY_ENTER, TryCatch #4 {IOException -> 0x00ad, blocks: (B:11:0x0008, B:13:0x000c, B:14:0x0012, B:16:0x0019, B:17:0x0025, B:20:0x0038, B:39:0x0097, B:40:0x009a, B:62:0x009d, B:63:0x00a0), top: B:10:0x0008, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void convert(InputStream inputStream, String str, ProgressListener progressListener, Decoder.Params params) throws JavaLayerException {
        int i;
        WaveFileObuffer waveFileObuffer;
        Throwable th;
        Exception e;
        Header readFrame;
        int i2 = 0;
        if (progressListener == null) {
            progressListener = PrintWriterProgressListener.newStdOut(0);
        }
        try {
            if (!(inputStream instanceof BufferedInputStream)) {
                inputStream = new BufferedInputStream(inputStream);
            }
            if (inputStream.markSupported()) {
                inputStream.mark(-1);
                i = countFrames(inputStream);
                inputStream.reset();
            } else {
                i = -1;
            }
            progressListener.converterUpdate(1, i, 0);
            Decoder decoder = new Decoder(params);
            Bitstream bitstream = new Bitstream(inputStream);
            if (i == -1) {
                i = Integer.MAX_VALUE;
            }
            long currentTimeMillis = System.currentTimeMillis();
            WaveFileObuffer waveFileObuffer2 = null;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                try {
                    readFrame = bitstream.readFrame();
                } catch (Exception e2) {
                    waveFileObuffer = waveFileObuffer2;
                    e = e2;
                } catch (Throwable th2) {
                    waveFileObuffer = waveFileObuffer2;
                    th = th2;
                    if (waveFileObuffer != null) {
                    }
                    throw th;
                }
                if (readFrame == null) {
                    break;
                }
                progressListener.readFrame(i2, readFrame);
                if (waveFileObuffer2 == null) {
                    waveFileObuffer = new WaveFileObuffer(readFrame.mode() == 3 ? 1 : 2, readFrame.frequency(), str);
                    try {
                        try {
                            decoder.setOutputBuffer(waveFileObuffer);
                            waveFileObuffer2 = waveFileObuffer;
                        } catch (Throwable th3) {
                            th = th3;
                            if (waveFileObuffer != null) {
                                waveFileObuffer.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        if (!progressListener.converterException(e)) {
                            throw new JavaLayerException(e.getLocalizedMessage(), e);
                        }
                        waveFileObuffer2 = waveFileObuffer;
                        i2++;
                    }
                }
                if (decoder.decodeFrame(readFrame, bitstream) != waveFileObuffer2) {
                    throw new InternalError("Output buffers are different.");
                }
                progressListener.decodedFrame(i2, readFrame, waveFileObuffer2);
                bitstream.closeFrame();
                i2++;
            }
            if (waveFileObuffer2 != null) {
                waveFileObuffer2.close();
            }
            progressListener.converterUpdate(2, (int) (System.currentTimeMillis() - currentTimeMillis), i2);
        } catch (IOException e4) {
            throw new JavaLayerException(e4.getLocalizedMessage(), e4);
        }
    }

    protected InputStream openInput(String str) throws IOException {
        return new BufferedInputStream(new FileInputStream(new File(str)));
    }

    public static class PrintWriterProgressListener implements ProgressListener {
        public static final int DEBUG_DETAIL = 7;
        public static final int EXPERT_DETAIL = 1;
        public static final int MAX_DETAIL = 10;
        public static final int NO_DETAIL = 0;
        public static final int VERBOSE_DETAIL = 2;
        private int detailLevel;
        private PrintWriter pw;

        public static PrintWriterProgressListener newStdOut(int i) {
            return new PrintWriterProgressListener(new PrintWriter((OutputStream) System.out, true), i);
        }

        public PrintWriterProgressListener(PrintWriter printWriter, int i) {
            this.pw = printWriter;
            this.detailLevel = i;
        }

        public boolean isDetail(int i) {
            return this.detailLevel >= i;
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void converterUpdate(int i, int i2, int i3) {
            if (isDetail(2) && i == 2) {
                if (i3 == 0) {
                    i3 = 1;
                }
                this.pw.println();
                this.pw.println("Converted " + i3 + " frames in " + i2 + " ms (" + (i2 / i3) + " ms per frame.)");
            }
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void parsedFrame(int i, Header header) {
            if (i == 0 && isDetail(2)) {
                String header2 = header.toString();
                this.pw.println("File is a " + header2);
                return;
            }
            if (isDetail(10)) {
                String header3 = header.toString();
                this.pw.println("Prased frame " + i + ": " + header3);
            }
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void readFrame(int i, Header header) {
            if (i == 0 && isDetail(2)) {
                String header2 = header.toString();
                this.pw.println("File is a " + header2);
                return;
            }
            if (isDetail(10)) {
                String header3 = header.toString();
                this.pw.println("Read frame " + i + ": " + header3);
            }
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public void decodedFrame(int i, Header header, Obuffer obuffer) {
            if (isDetail(10)) {
                String header2 = header.toString();
                this.pw.println("Decoded frame " + i + ": " + header2);
                PrintWriter printWriter = this.pw;
                StringBuilder sb = new StringBuilder("Output: ");
                sb.append(obuffer);
                printWriter.println(sb.toString());
                return;
            }
            if (isDetail(2)) {
                if (i == 0) {
                    this.pw.print("Converting.");
                    this.pw.flush();
                }
                if (i % 10 == 0) {
                    this.pw.print('.');
                    this.pw.flush();
                }
            }
        }

        @Override // javazoom.jl.converter.Converter.ProgressListener
        public boolean converterException(Throwable th) {
            if (this.detailLevel <= 0) {
                return false;
            }
            th.printStackTrace(this.pw);
            this.pw.flush();
            return false;
        }
    }
}
