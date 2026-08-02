package com.vk.im.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.common.view.settings.RadioSettingsViewGroup;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import xsna.b0w;
import xsna.bwt0;
import xsna.c0w;
import xsna.cfl;
import xsna.dgm;
import xsna.dhr0;
import xsna.eqb;
import xsna.f4m;
import xsna.gi8;
import xsna.iah0;
import xsna.ies;
import xsna.lpj;
import xsna.msy;
import xsna.oz50;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.ufk;
import xsna.y1z;

/* compiled from: ImCreateChatControlParamsFragment.kt */
/* loaded from: classes2.dex */
public final class ImCreateChatControlParamsFragment extends ImFragment implements ies {
    public static final /* synthetic */ int b0 = 0;
    public final d P = new d();
    public Integer Q;
    public ChatControls R;
    public eqb S;
    public final Object T;
    public final boolean U;
    public VkGroupHeader V;
    public final SparseArray<VkCell> W;
    public TextView X;
    public final SparseArray<com.vk.common.view.settings.a> Y;
    public final SparseIntArray Z;
    public final Object a0;

    /* compiled from: ImCreateChatControlParamsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ImCreateChatControlParamsFragment.kt */
    public final class b implements eqb.a {
        public b() {
        }

        @Override // xsna.eqb.a
        public final void a() {
            ImCreateChatControlParamsFragment imCreateChatControlParamsFragment = ImCreateChatControlParamsFragment.this;
            if (imCreateChatControlParamsFragment.U) {
                imCreateChatControlParamsFragment.fo(2);
                imCreateChatControlParamsFragment.go(2);
            } else {
                imCreateChatControlParamsFragment.Y.get(2).setChecked(true);
                TextView textView = imCreateChatControlParamsFragment.X;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(imCreateChatControlParamsFragment.getResources().getString(imCreateChatControlParamsFragment.Z.get(2)).toUpperCase(Locale.ROOT));
            }
            imCreateChatControlParamsFragment.Q = 2;
        }
    }

    /* compiled from: ImCreateChatControlParamsFragment.kt */
    public static final class c implements VkCell.f {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("RadioViewParams(checked="), this.a, ')');
        }
    }

    /* compiled from: ImCreateChatControlParamsFragment.kt */
    public static final class d extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public ImCreateChatControlParamsFragment() {
        cfl cflVar = new cfl(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, cflVar);
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        this.U = com.vk.toggle.b.A.a(imFeatures);
        this.W = new SparseArray<>();
        this.Y = new SparseArray<>();
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(0, R.string.vkim_new_chat_default_type_title);
        sparseIntArray.put(1, R.string.vkim_new_chat_closed_type_title);
        sparseIntArray.put(2, R.string.vkim_new_chat_custom_type_title);
        this.Z = sparseIntArray;
        this.a0 = msy.a(lazyThreadSafetyMode, new ufk(this, 8));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.P;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Intent intent = new Intent();
        eqb eqbVar = this.S;
        if (eqbVar == null) {
            eqbVar = null;
        }
        intent.putExtra("chat_controls", eqbVar.l);
        Integer num = this.Q;
        if (num != null) {
            intent.putExtra("chat_type", num.intValue());
        }
        s3q0 s3q0Var = s3q0.a;
        Mf(-1, intent);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void eo(VkCell vkCell, int i, final int i2) {
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, i), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
        vkCell.setOnClickListener(new View.OnClickListener() { // from class: xsna.a0w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = ImCreateChatControlParamsFragment.b0;
                SparseArray<ChatControls> sparseArray = ChatControls.n;
                int i4 = i2;
                boolean a2 = zik0.a(sparseArray, i4);
                ImCreateChatControlParamsFragment imCreateChatControlParamsFragment = ImCreateChatControlParamsFragment.this;
                if (a2) {
                    eqb eqbVar = imCreateChatControlParamsFragment.S;
                    if (eqbVar == null) {
                        eqbVar = null;
                    }
                    eqbVar.X0(sparseArray.get(i4));
                }
                imCreateChatControlParamsFragment.fo(i4);
                imCreateChatControlParamsFragment.go(i4);
                imCreateChatControlParamsFragment.Q = Integer.valueOf(i4);
            }
        });
        if (((Boolean) this.a0.getValue()).booleanValue()) {
            vkCell.setRightExtraViewController(new b0w());
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void fo(int i) {
        VkCell.Right.d a2;
        SparseArray<VkCell> sparseArray = this.W;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            VkCell valueAt = sparseArray.valueAt(i2);
            boolean z = sparseArray.keyAt(keyAt) == i;
            if (((Boolean) this.a0.getValue()).booleanValue()) {
                float f = 24;
                a2 = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new c(z), new Size(iah0.a(f), iah0.a(f))), null, null, 29);
            } else {
                a2 = z ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(6, null, true), null, 27) : null;
            }
            valueAt.setRight(a2);
        }
    }

    public final void go(int i) {
        VkGroupHeader vkGroupHeader = this.V;
        if (vkGroupHeader == null) {
            vkGroupHeader = null;
        }
        vkGroupHeader.setTitle(new VkGroupHeader.d(getResources().getString(this.Z.get(i)), null, null, null, 0, null, 510));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ChatControls chatControls;
        boolean z = this.U;
        View inflate = layoutInflater.inflate(z ? R.layout.vkim_fragment_create_chat_controls : R.layout.vkim_fragment_create_chat_controls_old, viewGroup, false);
        if (((Boolean) this.a0.getValue()).booleanValue()) {
            f4m.t(iah0.a(16), inflate.findViewById(R.id.chat_params_content_container));
        }
        if (bundle == null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                throw new IllegalArgumentException("ChatType is not defined savedInstanceState");
            }
            this.Q = Integer.valueOf(arguments.getInt("chat_type"));
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (chatControls = (ChatControls) arguments2.getParcelable("chat_controls")) == null) {
                throw new IllegalArgumentException("ChatControls is not defined savedInstanceState");
            }
            this.R = chatControls;
        } else {
            this.Q = Integer.valueOf(bundle.getInt("chat_type"));
            ChatControls chatControls2 = (ChatControls) bundle.getParcelable("chat_controls");
            if (chatControls2 == null) {
                throw new IllegalArgumentException("ChatControls is not defined savedInstanceState");
            }
            this.R = chatControls2;
        }
        int i = R.string.vkim_chat_settings_admin_controls;
        if (z) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                i = arguments3.getInt("title");
            }
            VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.im_topbar);
            vkTopBar.setBack(new VkTopBar.b(new dgm(this, 13), null, null, null, null, 30));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, i), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        } else {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                i = arguments4.getInt("title");
            }
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
            toolbar.setTitle(getResources().getString(i));
            toolbar.setNavigationOnClickListener(new gi8(this, 7));
        }
        ChatControls chatControls3 = this.R;
        if (chatControls3 == null) {
            chatControls3 = null;
        }
        eqb eqbVar = new eqb(chatControls3, new b(), (Peer) this.T.getValue(), 8);
        this.S = eqbVar;
        this.O.add(eqbVar);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.container);
        eqb eqbVar2 = this.S;
        viewGroup2.addView((eqbVar2 != null ? eqbVar2 : null).F0(viewGroup2, bundle));
        if (!z) {
            RadioSettingsViewGroup radioSettingsViewGroup = (RadioSettingsViewGroup) inflate.findViewById(R.id.chat_params_presets);
            Integer num = this.Q;
            if (num == null) {
                bwt0.p0(radioSettingsViewGroup, false);
                return inflate;
            }
            CheckableLabelSettingsView checkableLabelSettingsView = (CheckableLabelSettingsView) inflate.findViewById(R.id.default_chat);
            CheckableLabelSettingsView checkableLabelSettingsView2 = (CheckableLabelSettingsView) inflate.findViewById(R.id.closed_chat);
            CheckableLabelSettingsView checkableLabelSettingsView3 = (CheckableLabelSettingsView) inflate.findViewById(R.id.customs_chat);
            SparseArray<com.vk.common.view.settings.a> sparseArray = this.Y;
            sparseArray.put(0, checkableLabelSettingsView);
            sparseArray.put(1, checkableLabelSettingsView2);
            sparseArray.put(2, checkableLabelSettingsView3);
            sparseArray.get(num.intValue()).setChecked(true);
            radioSettingsViewGroup.setOnCheckedChangeListener(new c0w(this));
            TextView textView = (TextView) inflate.findViewById(R.id.params_title);
            this.X = textView;
            textView.setText(getResources().getString(this.Z.get(num.intValue())).toUpperCase(Locale.ROOT));
            return inflate;
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.chat_params_presets);
        Integer num2 = this.Q;
        if (num2 == null) {
            bwt0.p0(linearLayout, false);
            return inflate;
        }
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.default_chat);
        VkCell vkCell2 = (VkCell) inflate.findViewById(R.id.closed_chat);
        VkCell vkCell3 = (VkCell) inflate.findViewById(R.id.customs_chat);
        SparseArray<VkCell> sparseArray2 = this.W;
        sparseArray2.put(0, vkCell);
        sparseArray2.put(1, vkCell2);
        sparseArray2.put(2, vkCell3);
        eo(vkCell, R.string.vkim_new_chat_default_type, 0);
        eo(vkCell2, R.string.vkim_new_chat_closed_type, 1);
        eo(vkCell3, R.string.vkim_new_chat_custom_type_title, 2);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) inflate.findViewById(R.id.params_title);
        this.V = vkGroupHeader;
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
        fo(num2.intValue());
        go(num2.intValue());
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ChatControls chatControls = this.R;
        if (chatControls == null) {
            chatControls = null;
        }
        bundle.putParcelable("chat_controls", chatControls);
        Integer num = this.Q;
        if (num != null) {
            bundle.putInt("chat_type", num.intValue());
        }
    }
}
