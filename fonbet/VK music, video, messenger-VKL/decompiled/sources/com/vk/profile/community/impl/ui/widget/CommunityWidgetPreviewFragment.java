package com.vk.profile.community.impl.ui.widget;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.community.design.compose.widget.factory.CommunityWidgetType;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.community.entries.widget.Widget;
import com.vk.profile.community.api.widget.dto.CommunityWidgetPreviewArguments;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;
import xsna.cqm0;
import xsna.epx;
import xsna.hwh;
import xsna.i5i;
import xsna.ies;
import xsna.jg0;
import xsna.kmb;
import xsna.krv0;
import xsna.msy;
import xsna.oz50;
import xsna.pox0;
import xsna.qox0;
import xsna.ra;
import xsna.u1u0;
import xsna.um3;
import xsna.xd8;

/* compiled from: CommunityWidgetPreviewFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityWidgetPreviewFragment extends BaseFragment implements ies {
    public static final /* synthetic */ int U = 0;
    public final Object S;
    public final Object T;

    /* compiled from: CommunityWidgetPreviewFragment.kt */
    public static final class a extends oz50 {
    }

    public CommunityWidgetPreviewFragment() {
        ra raVar = new ra(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, raVar);
        this.T = msy.a(lazyThreadSafetyMode, new jg0(10));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        io(2);
        return true;
    }

    public final void io(int i) {
        Intent intent = new Intent();
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent.putExtras(arguments);
        }
        Mf(i, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        pox0 b;
        CommunityWidgetType communityWidgetType;
        JSONObject optJSONObject;
        View inflate = layoutInflater.inflate(R.layout.fragment_community_widget_preview, viewGroup, false);
        Bundle arguments = getArguments();
        i5i i5iVar = null;
        CommunityWidgetPreviewArguments communityWidgetPreviewArguments = arguments != null ? (CommunityWidgetPreviewArguments) arguments.getParcelable("widget_preview_arguments") : null;
        int i = 3;
        if (communityWidgetPreviewArguments == null) {
            io(3);
            return inflate;
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        u1u0.k(toolbar, R.drawable.vk_icon_cancel_24, R.string.accessibility_close);
        toolbar.setTitle(getString(R.string.community_install_widget_title));
        toolbar.setNavigationOnClickListener(new um3(this, i));
        View findViewById = inflate.findViewById(R.id.widget_preview_toolbar_separator);
        TypedValue typedValue = krv0.a;
        if (epx.f(krv0.i(requireContext()), Boolean.FALSE)) {
            findViewById.setVisibility(0);
        }
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.community_logo);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("app_icon")) == null) {
            str = "";
        }
        vkImage.o0(str, null);
        ((TextView) inflate.findViewById(R.id.community_widget_preview_text)).setText(getString(R.string.mini_app_community_install_widget_text, communityWidgetPreviewArguments.e, communityWidgetPreviewArguments.c));
        JSONObject optJSONObject2 = cqm0.j(communityWidgetPreviewArguments.b).optJSONObject("response");
        Widget a2 = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("widget")) == null) ? null : Widget.a.a(optJSONObject);
        if (a2 != null && (b = qox0.b(a2, requireContext())) != null) {
            switch (a2.b) {
                case 2:
                    communityWidgetType = CommunityWidgetType.LIST;
                    break;
                case 3:
                    communityWidgetType = CommunityWidgetType.TABLE;
                    break;
                case 4:
                    communityWidgetType = CommunityWidgetType.TILES;
                    break;
                case 5:
                    communityWidgetType = CommunityWidgetType.COMPACT_LIST;
                    break;
                case 6:
                    communityWidgetType = CommunityWidgetType.COVER_LIST;
                    break;
                case 7:
                    communityWidgetType = CommunityWidgetType.MATCH;
                    break;
                case 8:
                    communityWidgetType = CommunityWidgetType.MATCHES;
                    break;
                case 9:
                    communityWidgetType = CommunityWidgetType.DONATION;
                    break;
                default:
                    communityWidgetType = CommunityWidgetType.TEXT;
                    break;
            }
            i5iVar = hwh.a(requireContext(), communityWidgetType);
            i5iVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            i5iVar.setOnOpenUrl(new xd8(1, this, CommunityWidgetPreviewFragment.class, "openUrl", "openUrl(Ljava/lang/String;)V", 0, 4));
            i5iVar.h(b);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.community_widget_preview_container);
        if (i5iVar != null) {
            viewGroup2.addView(i5iVar);
        }
        inflate.findViewById(R.id.community_widget_install_button).setOnClickListener(new kmb(this, communityWidgetPreviewArguments, inflate, 1));
        return inflate;
    }
}
