package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

/* loaded from: classes10.dex */
public class Tailer implements Runnable {
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final Charset charset;
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    public Tailer(File file, TailerListener tailerListener, long j) {
        this(file, tailerListener, j, false);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z) {
        this(file, tailerListener, j, z, 8192);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        this(file, tailerListener, j, z, z2, 8192);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, int i) {
        this(file, tailerListener, j, z, false, i);
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        this(file, DEFAULT_CHARSET, tailerListener, j, z, z2, i);
    }

    public Tailer(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        this.run = true;
        this.file = file;
        this.delayMillis = j;
        this.end = z;
        this.inbuf = new byte[i];
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z2;
        this.charset = charset;
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, int i) {
        return create(file, tailerListener, j, z, false, i);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        return create(file, DEFAULT_CHARSET, tailerListener, j, z, z2, i);
    }

    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        Tailer tailer = new Tailer(file, charset, tailerListener, j, z, z2, i);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z) {
        return create(file, tailerListener, j, z, 8192);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
        return create(file, tailerListener, j, z, z2, 8192);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j) {
        return create(file, tailerListener, j, false);
    }

    public static Tailer create(File file, TailerListener tailerListener) {
        return create(file, tailerListener, 1000L, false);
    }

    public File getFile() {
        return this.file;
    }

    protected boolean getRun() {
        return this.run;
    }

    public long getDelay() {
        return this.delayMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00de, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00eb, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f0, code lost:
    
        r13.listener.handle(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e9, code lost:
    
        if (r0 == null) goto L80;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        RandomAccessFile randomAccessFile;
        long readLines;
        long lastModified;
        RandomAccessFile randomAccessFile2 = null;
        long j = 0;
        long j2 = 0;
        while (getRun() && randomAccessFile2 == null) {
            try {
                try {
                    try {
                        randomAccessFile2 = new RandomAccessFile(this.file, "r");
                    } catch (FileNotFoundException unused) {
                        this.listener.fileNotFound();
                    }
                    if (randomAccessFile2 == null) {
                        Thread.sleep(this.delayMillis);
                    } else {
                        j2 = this.end ? this.file.length() : 0L;
                        j = this.file.lastModified();
                        randomAccessFile2.seek(j2);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (InterruptedException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
            }
        }
        while (getRun()) {
            boolean isFileNewer = FileUtils.isFileNewer(this.file, j);
            long length = this.file.length();
            if (length < j2) {
                this.listener.fileRotated();
                try {
                    randomAccessFile = new RandomAccessFile(this.file, "r");
                    try {
                        try {
                            readLines(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (Throwable th4) {
                                        try {
                                            th.addSuppressed(th4);
                                        } catch (FileNotFoundException unused2) {
                                            randomAccessFile2 = randomAccessFile;
                                            this.listener.fileNotFound();
                                            Thread.sleep(this.delayMillis);
                                        }
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (IOException e3) {
                        this.listener.handle(e3);
                    }
                    if (randomAccessFile2 != null) {
                        try {
                            try {
                                randomAccessFile2.close();
                            } catch (FileNotFoundException unused3) {
                                j2 = 0;
                                randomAccessFile2 = randomAccessFile;
                                this.listener.fileNotFound();
                                Thread.sleep(this.delayMillis);
                            }
                        } catch (InterruptedException e4) {
                            e = e4;
                            randomAccessFile2 = randomAccessFile;
                            Thread.currentThread().interrupt();
                            this.listener.handle(e);
                        } catch (Exception e5) {
                            e = e5;
                            randomAccessFile2 = randomAccessFile;
                            this.listener.handle(e);
                        } catch (Throwable th5) {
                            th = th5;
                            randomAccessFile2 = randomAccessFile;
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e6) {
                                    this.listener.handle(e6);
                                }
                            }
                            stop();
                            throw th;
                        }
                    }
                    j2 = 0;
                    randomAccessFile2 = randomAccessFile;
                } catch (Throwable th6) {
                    th = th6;
                    randomAccessFile = randomAccessFile2;
                }
            } else {
                if (length > j2) {
                    readLines = readLines(randomAccessFile2);
                    lastModified = this.file.lastModified();
                } else {
                    if (isFileNewer) {
                        randomAccessFile2.seek(0L);
                        readLines = readLines(randomAccessFile2);
                        lastModified = this.file.lastModified();
                    }
                    if (this.reOpen && randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    Thread.sleep(this.delayMillis);
                    if (getRun() && this.reOpen) {
                        randomAccessFile = new RandomAccessFile(this.file, "r");
                        randomAccessFile.seek(j2);
                        randomAccessFile2 = randomAccessFile;
                    }
                }
                long j3 = lastModified;
                j2 = readLines;
                j = j3;
                if (this.reOpen) {
                    randomAccessFile2.close();
                }
                Thread.sleep(this.delayMillis);
                if (getRun()) {
                    randomAccessFile = new RandomAccessFile(this.file, "r");
                    randomAccessFile.seek(j2);
                    randomAccessFile2 = randomAccessFile;
                }
            }
        }
        stop();
    }

    public void stop() {
        this.run = false;
    }

    private long readLines(RandomAccessFile randomAccessFile) throws IOException {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long j = filePointer;
            boolean z = false;
            while (getRun() && (read = randomAccessFile.read(this.inbuf)) != -1) {
                for (int i = 0; i < read; i++) {
                    byte b = this.inbuf[i];
                    if (b == 10) {
                        this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                        byteArrayOutputStream.reset();
                        filePointer = i + j + 1;
                        z = false;
                    } else if (b != 13) {
                        if (z) {
                            this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                            byteArrayOutputStream.reset();
                            filePointer = i + j + 1;
                            z = false;
                        }
                        byteArrayOutputStream.write(b);
                    } else {
                        if (z) {
                            byteArrayOutputStream.write(13);
                        }
                        z = true;
                    }
                }
                j = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(filePointer);
            TailerListener tailerListener = this.listener;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return filePointer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
