package javazoom.jl.converter;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import javazoom.jl.converter.RiffFile;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes9.dex */
public class WaveFile extends RiffFile {
    public static final int MAX_WAVE_CHANNELS = 2;
    private int num_samples;
    private long pcm_data_offset = 0;
    private RiffFile.RiffChunkHeader pcm_data = new RiffFile.RiffChunkHeader();
    private WaveFormat_Chunk wave_format = new WaveFormat_Chunk();

    class WaveFormat_ChunkData {
        public short nChannels = 0;
        public int nSamplesPerSec = 0;
        public int nAvgBytesPerSec = 0;
        public short nBlockAlign = 0;
        public short nBitsPerSample = 0;
        public short wFormatTag = 1;

        public WaveFormat_ChunkData() {
            Config(AudioConstants.AUDIO_SAMPLE_RATE, (short) 16, (short) 1);
        }

        public void Config(int i, short s, short s2) {
            this.nSamplesPerSec = i;
            this.nChannels = s2;
            this.nBitsPerSample = s;
            this.nAvgBytesPerSec = ((i * s2) * s) / 8;
            this.nBlockAlign = (short) ((s2 * s) / 8);
        }
    }

    class WaveFormat_Chunk {
        public WaveFormat_ChunkData data;
        public RiffFile.RiffChunkHeader header;

        public WaveFormat_Chunk() {
            this.header = new RiffFile.RiffChunkHeader();
            this.data = WaveFile.this.new WaveFormat_ChunkData();
            this.header.ckID = RiffFile.FourCC("fmt ");
            this.header.ckSize = 16;
        }

        public int VerifyValidity() {
            if (this.header.ckID == RiffFile.FourCC("fmt ")) {
                return ((this.data.nChannels == 1 || this.data.nChannels == 2) && this.data.nAvgBytesPerSec == ((this.data.nChannels * this.data.nSamplesPerSec) * this.data.nBitsPerSample) / 8 && this.data.nBlockAlign == (this.data.nChannels * this.data.nBitsPerSample) / 8) ? 1 : 0;
            }
            return 0;
        }
    }

    public class WaveFileSample {
        public short[] chan = new short[2];

        public WaveFileSample() {
        }
    }

    public WaveFile() {
        this.num_samples = 0;
        this.pcm_data.ckID = FourCC("data");
        this.pcm_data.ckSize = 0;
        this.num_samples = 0;
    }

    public int OpenForWrite(String str, int i, short s, short s2) {
        if (str == null || (!(s == 8 || s == 16) || s2 < 1 || s2 > 2)) {
            return 4;
        }
        this.wave_format.data.Config(i, s, s2);
        int Open = Open(str, 1);
        if (Open != 0) {
            return Open;
        }
        int Write = Write(new byte[]{BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions}, 4);
        if (Write != 0) {
            return Write;
        }
        Write(this.wave_format.header, 8);
        Write(this.wave_format.data.wFormatTag, 2);
        Write(this.wave_format.data.nChannels, 2);
        Write(this.wave_format.data.nSamplesPerSec, 4);
        Write(this.wave_format.data.nAvgBytesPerSec, 4);
        Write(this.wave_format.data.nBlockAlign, 2);
        int Write2 = Write(this.wave_format.data.nBitsPerSample, 2);
        if (Write2 != 0) {
            return Write2;
        }
        this.pcm_data_offset = CurrentFilePosition();
        return Write(this.pcm_data, 8);
    }

    public int WriteData(short[] sArr, int i) {
        int i2 = i * 2;
        this.pcm_data.ckSize += i2;
        return super.Write(sArr, i2);
    }

    @Override // javazoom.jl.converter.RiffFile
    public int Close() {
        int Backpatch = this.fmode == 1 ? Backpatch(this.pcm_data_offset, this.pcm_data, 8) : 0;
        return Backpatch == 0 ? super.Close() : Backpatch;
    }

    public int SamplingRate() {
        return this.wave_format.data.nSamplesPerSec;
    }

    public short BitsPerSample() {
        return this.wave_format.data.nBitsPerSample;
    }

    public short NumChannels() {
        return this.wave_format.data.nChannels;
    }

    public int NumSamples() {
        return this.num_samples;
    }

    public int OpenForWrite(String str, WaveFile waveFile) {
        return OpenForWrite(str, waveFile.SamplingRate(), waveFile.BitsPerSample(), waveFile.NumChannels());
    }

    @Override // javazoom.jl.converter.RiffFile
    public long CurrentFilePosition() {
        return super.CurrentFilePosition();
    }
}
