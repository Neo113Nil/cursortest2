package com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.aqw;
import xsna.aza;
import xsna.fbh;
import xsna.ies;
import xsna.jai;
import xsna.mpi;
import xsna.msy;
import xsna.oz50;
import xsna.r3h;
import xsna.wh50;
import xsna.wow;
import xsna.zak0;

/* compiled from: DonutLevelsFragment.kt */
/* loaded from: classes4.dex */
public final class DonutLevelsFragment extends FragmentImpl implements ies {
    public static final /* synthetic */ int R = 0;
    public final wh50 N = k.b(null);
    public final wh50 O = k.b(new wow(EmptyList.b));
    public final Object P = msy.a(LazyThreadSafetyMode.NONE, new fbh(this, 10));
    public final r3h Q = new r3h(this, 9);

    /* compiled from: DonutLevelsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(DonutLevelsFragment.class, null, null);
        }
    }

    public final void eo(DonutLevel donutLevel) {
        ((zak0) this.N).setValue(donutLevel);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.os.Parcelable] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List list;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("level", DonutLevel.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable("level");
                parcelable = parcelable3 instanceof DonutLevel ? parcelable3 : null;
            }
            r5 = (DonutLevel) parcelable;
        }
        eo(r5);
        Bundle arguments2 = getArguments();
        wh50 wh50Var = this.O;
        if (arguments2 != null) {
            list = Build.VERSION.SDK_INT >= 33 ? arguments2.getParcelableArrayList("levels", DonutLevel.class) : arguments2.getParcelableArrayList("levels");
        }
        list = ((wow) ((zak0) wh50Var).getValue()).b;
        ((zak0) wh50Var).setValue(new wow(list));
        ComposeView a2 = mpi.a(requireContext());
        aqw.l(a2, new jai(1476228191, new aza(this, 5), true));
        return a2;
    }
}
