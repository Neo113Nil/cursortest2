package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.view.branding.BrandingLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hcb implements krk {
    public final /* synthetic */ int a;
    public final View b;

    public hcb(BrandingLayout brandingLayout, ComposeView composeView) {
        this.a = 5;
        this.b = brandingLayout;
    }

    public static hcb a(View view) {
        if (view != null) {
            return new hcb(4, (AdBannerView) view);
        }
        yhk.s("rootView");
        return null;
    }

    public static hcb b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.share_match_details_modal_inline_logo, viewGroup, false);
        if (inflate != null) {
            return new hcb(3, (ImageView) inflate);
        }
        yhk.s("rootView");
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (RelativeLayout) view;
            case 1:
                return (CheckedTextView) view;
            case 2:
                return (GridLayout) view;
            case 3:
                return (ImageView) view;
            case 4:
                return (AdBannerView) view;
            default:
                return (BrandingLayout) view;
        }
    }

    public /* synthetic */ hcb(int i, View view) {
        this.a = i;
        this.b = view;
    }
}
