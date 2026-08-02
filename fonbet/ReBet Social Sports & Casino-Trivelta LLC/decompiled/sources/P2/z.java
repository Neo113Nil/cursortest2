package P2;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f8801a;

    public z(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f8801a = webkitToCompatConverterBoundaryInterface;
    }

    public s a(WebSettings webSettings) {
        return new s((WebSettingsBoundaryInterface) AbstractC6757a.a(WebSettingsBoundaryInterface.class, this.f8801a.convertSettings(webSettings)));
    }
}
