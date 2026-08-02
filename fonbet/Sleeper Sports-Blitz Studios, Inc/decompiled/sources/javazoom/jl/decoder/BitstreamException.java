package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public class BitstreamException extends JavaLayerException implements BitstreamErrors {
    private int errorcode;

    public BitstreamException(String str, Throwable th) {
        super(str, th);
        this.errorcode = 256;
    }

    public BitstreamException(int i, Throwable th) {
        this(getErrorString(i), th);
        this.errorcode = i;
    }

    public int getErrorCode() {
        return this.errorcode;
    }

    public static String getErrorString(int i) {
        return "Bitstream errorcode " + Integer.toHexString(i);
    }
}
