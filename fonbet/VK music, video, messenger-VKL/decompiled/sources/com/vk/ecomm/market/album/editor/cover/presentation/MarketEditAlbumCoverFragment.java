package com.vk.ecomm.market.album.editor.cover.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.ColorProgressBar;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketAlbumImagePickerView;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import xsna.ao50;
import xsna.ax00;
import xsna.ayo;
import xsna.bwt0;
import xsna.cvh;
import xsna.dx00;
import xsna.eo9;
import xsna.f4m;
import xsna.f4z;
import xsna.fpf0;
import xsna.fx00;
import xsna.gm50;
import xsna.gx00;
import xsna.jx00;
import xsna.km50;
import xsna.kx00;
import xsna.m7m;
import xsna.mk50;
import xsna.mre;
import xsna.ox00;
import xsna.oz50;
import xsna.sw50;
import xsna.vk50;
import xsna.xn50;
import xsna.xz5;
import xsna.z8f;
import xsna.zw00;
import xsna.zxo;
import xsna.zz5;

/* compiled from: MarketEditAlbumCoverFragment.kt */
/* loaded from: classes18.dex */
public final class MarketEditAlbumCoverFragment extends MviImplFragment<ax00, ox00, zw00> {
    public static final /* synthetic */ int c0 = 0;
    public MarketAlbumImagePickerView Q;
    public EditText R;
    public CheckBox S;
    public CheckBox T;
    public TextView U;
    public TextView V;
    public TextView W;
    public ColorProgressBar X;
    public LinearLayout Y;
    public final int Z = R.drawable.vkui_bg_edittext_error;
    public final int a0 = R.drawable.vkui_bg_edittext;
    public final f4z<b> b0 = new f4z<>();

    /* compiled from: MarketEditAlbumCoverFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(MarketEditAlbumCoverFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.market_edit_album_cover_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ox00 ox00Var = (ox00) ao50Var;
        this.b0.a(new mre(this, 28), getViewLifecycleOwner());
        EditText editText = (EditText) view.findViewById(R.id.album_name_edit_text);
        this.R = editText;
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(22)});
        EditText editText2 = this.R;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.addTextChangedListener(new gx00(this));
        EditText editText3 = this.R;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setOnEditorActionListener(new fx00());
        this.X = (ColorProgressBar) view.findViewById(R.id.progress_bar);
        this.Y = (LinearLayout) view.findViewById(R.id.content);
        this.S = (CheckBox) view.findViewById(R.id.album_is_main_checkbox);
        this.T = (CheckBox) view.findViewById(R.id.album_is_hidden_checkbox);
        this.Q = (MarketAlbumImagePickerView) bwt0.p(view, R.id.album_image_picker, null, null, 6);
        this.U = (TextView) view.findViewById(R.id.album_next_button_text_view);
        TextView textView = (TextView) view.findViewById(R.id.album_name_error_text_view);
        f4m.j(textView);
        this.V = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.counter_current_value_text_view);
        this.W = textView2;
        textView2.setText("0");
        ((TextView) view.findViewById(R.id.counter_max_value_text_view)).setText(" / 22");
        MarketAlbumImagePickerView marketAlbumImagePickerView = this.Q;
        if (marketAlbumImagePickerView == null) {
            marketAlbumImagePickerView = null;
        }
        marketAlbumImagePickerView.setOnImageClickListener(new xz5(this, 4));
        marketAlbumImagePickerView.setOnImageChangeListener(new cvh(this, 21));
        CheckBox checkBox = this.S;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.setOnCheckedChangeListener(new zz5(1, this));
        CheckBox checkBox2 = this.T;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        checkBox2.setOnCheckedChangeListener(new dx00(this, 0));
        TextView textView3 = this.U;
        bwt0.i0(textView3 != null ? textView3 : null, new z8f(this, 26));
        gm50.a.b(this, ox00Var.b, new zxo(this, 24));
        gm50.a.b(this, ox00Var.a, new ayo(this, 18));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, zw00.c.b.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        if (4 == i && i2 == -1) {
            MarketAlbumImagePickerView marketAlbumImagePickerView = this.Q;
            String str = null;
            if (marketAlbumImagePickerView == null) {
                marketAlbumImagePickerView = null;
            }
            UserId userId = (UserId) requireArguments().getParcelable("owner_id");
            if (userId == null) {
                userId = UserId.d;
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                str = extras.getString(X3.i.b);
            }
            marketAlbumImagePickerView.d(userId, str);
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        sw50 id = ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).id();
        UserId userId = (UserId) requireArguments().getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        return new ax00(new jx00(kx00.c.b), userId, (GoodAlbumEditFlowEntity) requireArguments().getParcelable("album"), new eo9(3), new com.vk.ecomm.market.album.editor.cover.presentation.a(this, this.b0, id));
    }
}
