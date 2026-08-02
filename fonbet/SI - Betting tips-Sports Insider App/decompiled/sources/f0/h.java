package f0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f9288a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f9289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9290c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f9288a = colorStateList;
        this.f9289b = configuration;
        this.f9290c = theme == null ? 0 : theme.hashCode();
    }
}
