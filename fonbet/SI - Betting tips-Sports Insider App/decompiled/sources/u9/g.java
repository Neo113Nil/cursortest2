package u9;

import android.graphics.Paint;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24104a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24105b;

    static {
        int[] iArr = new int[Paint.Style.values().length];
        f24105b = iArr;
        try {
            iArr[Paint.Style.STROKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24105b[Paint.Style.FILL_AND_STROKE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24105b[Paint.Style.FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Paint.Align.values().length];
        f24104a = iArr2;
        try {
            iArr2[Paint.Align.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f24104a[Paint.Align.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f24104a[Paint.Align.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
