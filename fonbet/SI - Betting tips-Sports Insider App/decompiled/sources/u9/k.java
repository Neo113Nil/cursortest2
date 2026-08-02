package u9;

import android.graphics.Shader;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24124a;

    static {
        int[] iArr = new int[Shader.TileMode.values().length];
        f24124a = iArr;
        try {
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24124a[Shader.TileMode.REPEAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24124a[Shader.TileMode.MIRROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
