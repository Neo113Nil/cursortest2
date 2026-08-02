package com.vk.avatarpicker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.vk.avatarpicker.a;
import com.vk.crop.CropImageView;
import com.vk.movika.sdk.base.observable.o;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.too0;
import xsna.x16;
import xsna.z4f;

/* compiled from: CropFragment.kt */
/* loaded from: classes15.dex */
public class b extends Fragment implements too0 {
    public ContextThemeWrapper h;
    public a i;
    public CropImageView j;

    @Override // xsna.too0
    public final void Ng() {
        ContextThemeWrapper contextThemeWrapper = this.h;
        if (contextThemeWrapper == null) {
            contextThemeWrapper = null;
        }
        contextThemeWrapper.setTheme(dhr0.C().c);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.h = new ContextThemeWrapper(context, dhr0.C().c);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = this.h;
        if (contextThemeWrapper == null) {
            contextThemeWrapper = null;
        }
        return layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fragment_crop, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        a aVar = this.i;
        if (aVar == null) {
            aVar = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = aVar.c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.j = (CropImageView) view.findViewById(R.id.crop_image_view);
        bwt0.i0((TextView) view.findViewById(R.id.done_button), new o(this, 25));
        ((Toolbar) view.findViewById(R.id.toolbar)).setNavigationOnClickListener(new x16(this, 5));
        Bundle arguments = getArguments();
        Uri uri = arguments != null ? (Uri) arguments.getParcelable("arg_image_uri") : null;
        Object mo2getContext = mo2getContext();
        this.i = new a(uri, mo2getContext instanceof a.InterfaceC0422a ? (a.InterfaceC0422a) mo2getContext : null, new z4f(this, 14));
    }
}
