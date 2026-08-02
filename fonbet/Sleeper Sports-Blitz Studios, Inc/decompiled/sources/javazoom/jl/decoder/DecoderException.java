package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public class DecoderException extends JavaLayerException implements DecoderErrors {
    private int errorcode;

    public DecoderException(String str, Throwable th) {
        super(str, th);
        this.errorcode = 512;
    }

    public DecoderException(int i, Throwable th) {
        this(getErrorString(i), th);
        this.errorcode = i;
    }

    public int getErrorCode() {
        return this.errorcode;
    }

    public static String getErrorString(int i) {
        return "Decoder errorcode " + Integer.toHexString(i);
    }
}
