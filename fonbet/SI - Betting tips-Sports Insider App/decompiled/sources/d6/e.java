package d6;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class e extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Status f8245a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Status status) {
        super(r4.toString());
        int i5 = status.f4466a;
        String str = status.f4467b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 2 + String.valueOf(str).length());
        sb2.append(i5);
        sb2.append(": ");
        sb2.append(str);
        this.f8245a = status;
    }
}
