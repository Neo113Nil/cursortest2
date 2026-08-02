package com.vk.auth.ui.checkaccess;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.gm90;
import xsna.j5g;
import xsna.p4g;
import xsna.par0;
import xsna.q55;
import xsna.s25;
import xsna.s3q0;
import xsna.sbu0;
import xsna.tk5;
import xsna.uhv0;
import xsna.vj0;

/* compiled from: CheckAccessBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public class CheckAccessBottomSheetFragment extends sbu0 {
    public boolean D;
    public final boolean C = true;
    public final int E = R.layout.vk_check_access_bottom_sheet_fragment;

    /* compiled from: CheckAccessBottomSheetFragment.kt */
    public static final class CloseWithErrorResult implements Parcelable {
        public static final Parcelable.Creator<CloseWithErrorResult> CREATOR = new a();
        public final String b;
        public final boolean c;

        /* compiled from: CheckAccessBottomSheetFragment.kt */
        public static final class a implements Parcelable.Creator<CloseWithErrorResult> {
            @Override // android.os.Parcelable.Creator
            public final CloseWithErrorResult createFromParcel(Parcel parcel) {
                return new CloseWithErrorResult(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CloseWithErrorResult[] newArray(int i) {
                return new CloseWithErrorResult[i];
            }
        }

        public CloseWithErrorResult(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: CheckAccessBottomSheetFragment.kt */
    public static final class a {
        public static Bundle a(PasswordCheckInitStructure passwordCheckInitStructure) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_structure", passwordCheckInitStructure);
            return bundle;
        }
    }

    @Override // xsna.oeu0
    public final int Gn() {
        return this.E;
    }

    public final void Mn(uhv0 uhv0Var, boolean z) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a b = tk5.b(childFragmentManager, childFragmentManager);
        b.r = true;
        if (z) {
            b.i(R.anim.vk_slide_in_right, R.anim.vk_slide_out_left, 0, 0);
        }
        b.g(R.id.vk_cua_container, uhv0Var, null);
        b.l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (!this.D) {
            q55 q55Var = q55.a;
            List y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                try {
                    ((s25) it.next()).m();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    bVar.invoke(th);
                }
            }
        }
        super.onDestroy();
    }

    @Override // xsna.oeu0, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FragmentActivity activity;
        if (this.C && (activity = getActivity()) != null) {
            activity.finish();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onViewCreated(view, bundle);
        getChildFragmentManager().l0("key_check_access_result", this, new vj0(this, 9));
        if (bundle == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("key_structure", PasswordCheckInitStructure.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = arguments.getParcelable("key_structure");
                    parcelable = (PasswordCheckInitStructure) (parcelable3 instanceof PasswordCheckInitStructure ? parcelable3 : null);
                }
                r4 = (PasswordCheckInitStructure) parcelable;
            }
            gm90 gm90Var = new gm90();
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("structure", r4);
            gm90Var.setArguments(bundle2);
            Mn(gm90Var, false);
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFastLoginBottomSheetTheme;
    }
}
