package com.vk.ecomm.market.album;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.a06;
import xsna.bq00;
import xsna.bwt0;
import xsna.bx00;
import xsna.bzj;
import xsna.c40;
import xsna.cx00;
import xsna.dhr0;
import xsna.drm0;
import xsna.f4m;
import xsna.fkq0;
import xsna.hg1;
import xsna.hx00;
import xsna.jai;
import xsna.mhy;
import xsna.msy;
import xsna.oac;
import xsna.oz50;
import xsna.qcz;
import xsna.rr00;
import xsna.rsg0;
import xsna.sfg;
import xsna.u19;
import xsna.yd10;
import xsna.yfb;
import xsna.z01;

/* compiled from: MarketEditAlbumCoverFragment.kt */
/* loaded from: classes18.dex */
public final class MarketEditAlbumCoverFragment extends BaseFragment {
    public static final /* synthetic */ int d0 = 0;
    public ComposeView S;
    public MarketAlbumImagePickerView T;
    public EditText U;
    public CheckBox V;
    public CheckBox W;
    public TextView X;
    public TextView Y;
    public TextView Z;
    public final int a0 = R.drawable.vkui_bg_edittext_error;
    public final int b0 = R.drawable.vkui_bg_edittext;
    public final Object c0 = msy.a(LazyThreadSafetyMode.NONE, new bzj(this, 25));

    /* compiled from: MarketEditAlbumCoverFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(MarketEditAlbumCoverFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (jo()) {
            return false;
        }
        rr00.a(requireContext(), new sfg(this, 28));
        return true;
    }

    public final GoodAlbumEditFlowEntity io() {
        UserId userId = (UserId) requireArguments().getParcelable("owner_id");
        EditText editText = this.U;
        if (editText == null) {
            editText = null;
        }
        String obj = drm0.p0(editText.getText().toString()).toString();
        CheckBox checkBox = this.V;
        if (checkBox == null) {
            checkBox = null;
        }
        boolean isChecked = checkBox.isChecked();
        CheckBox checkBox2 = this.W;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        boolean isChecked2 = checkBox2.isChecked();
        MarketAlbumImagePickerView marketAlbumImagePickerView = this.T;
        Photo photo = (marketAlbumImagePickerView != null ? marketAlbumImagePickerView : null).getPhoto();
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) requireArguments().getParcelable("album");
        return goodAlbumEditFlowEntity != null ? GoodAlbumEditFlowEntity.zb(goodAlbumEditFlowEntity, obj, null, photo, 0, isChecked, isChecked2, null, 917) : new GoodAlbumEditFlowEntity(userId, obj, null, photo, 0, isChecked, isChecked2, new ArrayList(), null, null, 772, null);
    }

    public final boolean jo() {
        Integer num;
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) requireArguments().getParcelable("album");
        return (goodAlbumEditFlowEntity == null || (num = goodAlbumEditFlowEntity.d) == null || num.intValue() == -1) ? false : true;
    }

    public final void ko() {
        EditText editText = this.U;
        if (editText == null) {
            editText = null;
        }
        Editable text = editText.getText();
        boolean z = text == null || drm0.N(text);
        lo(z);
        if (z) {
            return;
        }
        mhy.b(requireContext());
        if (jo()) {
            Intent intent = new Intent();
            intent.putExtra("album", io());
            Mf(-1, intent);
        } else {
            GoodAlbumEditFlowEntity io2 = io();
            finish();
            new MarketEditAlbumGoodsFragment.a(io2).l(this);
        }
    }

    public final void lo(boolean z) {
        if (z) {
            TextView textView = this.Y;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(0);
            EditText editText = this.U;
            dhr0.h0(this.a0, editText != null ? editText : null);
            return;
        }
        TextView textView2 = this.Y;
        if (textView2 == null) {
            textView2 = null;
        }
        f4m.j(textView2);
        EditText editText2 = this.U;
        dhr0.h0(this.b0, editText2 != null ? editText2 : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        if (4 == i && i2 == -1) {
            MarketAlbumImagePickerView marketAlbumImagePickerView = this.T;
            String str = null;
            if (marketAlbumImagePickerView == null) {
                marketAlbumImagePickerView = null;
            }
            UserId userId = (UserId) requireArguments().getParcelable("owner_id");
            if (intent != null && (extras = intent.getExtras()) != null) {
                str = extras.getString(X3.i.b);
            }
            marketAlbumImagePickerView.d(userId, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MarketEditAlbumCoverFragment marketEditAlbumCoverFragment;
        View inflate = layoutInflater.inflate(R.layout.market_edit_album_cover_fragment, viewGroup, false);
        if (jo()) {
            marketEditAlbumCoverFragment = this;
        } else {
            marketEditAlbumCoverFragment = this;
            fo(hg1.m(rsg0.y0(yfb.x(new yd10().y(fkq0.e((UserId) requireArguments().getParcelable("owner_id")))), null, null, 3), mo2getContext(), 0L, false, 62).subscribe(new c40(new u19(1, marketEditAlbumCoverFragment, MarketEditAlbumCoverFragment.class, "consumeMarketSettings", "consumeMarketSettings(Lcom/vk/api/generated/market/dto/MarketSettingsDto;)V", 0, 4), 27), new cx00(new bq00(this, 3), 0)));
        }
        marketEditAlbumCoverFragment.S = (ComposeView) inflate.findViewById(R.id.market_edit_album_cover_top_bar_compose_view);
        EditText editText = (EditText) inflate.findViewById(R.id.album_name_edit_text);
        marketEditAlbumCoverFragment.U = editText;
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(22)});
        EditText editText2 = marketEditAlbumCoverFragment.U;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.addTextChangedListener(new hx00(this));
        EditText editText3 = marketEditAlbumCoverFragment.U;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setOnEditorActionListener(new bx00());
        marketEditAlbumCoverFragment.V = (CheckBox) inflate.findViewById(R.id.album_is_main_checkbox);
        marketEditAlbumCoverFragment.W = (CheckBox) inflate.findViewById(R.id.album_is_hidden_checkbox);
        marketEditAlbumCoverFragment.T = (MarketAlbumImagePickerView) bwt0.p(inflate, R.id.album_image_picker, null, null, 6);
        marketEditAlbumCoverFragment.X = (TextView) inflate.findViewById(R.id.album_next_button_text_view);
        TextView textView = (TextView) inflate.findViewById(R.id.album_name_error_text_view);
        marketEditAlbumCoverFragment.Y = textView;
        f4m.j(textView);
        EditText editText4 = marketEditAlbumCoverFragment.U;
        (editText4 != null ? editText4 : null).addTextChangedListener(new b());
        TextView textView2 = (TextView) inflate.findViewById(R.id.counter_current_value_text_view);
        marketEditAlbumCoverFragment.Z = textView2;
        textView2.setText("0");
        ((TextView) inflate.findViewById(R.id.counter_max_value_text_view)).setText(" / 22");
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        ComposeView composeView = this.S;
        if (composeView == null) {
            composeView = null;
        }
        composeView.setContent(new jai(-1623704687, new oac(this, 9), true));
        MarketAlbumImagePickerView marketAlbumImagePickerView = this.T;
        if (marketAlbumImagePickerView == null) {
            marketAlbumImagePickerView = null;
        }
        marketAlbumImagePickerView.setOnImageClickListener(new a06(this, 6));
        MarketAlbumImagePickerView marketAlbumImagePickerView2 = this.T;
        if (marketAlbumImagePickerView2 == null) {
            marketAlbumImagePickerView2 = null;
        }
        if (jo()) {
            marketAlbumImagePickerView2.setHideCancelButton(true);
        }
        CheckBox checkBox = this.V;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.ex00
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CheckBox checkBox2 = MarketEditAlbumCoverFragment.this.W;
                if (checkBox2 == null) {
                    checkBox2 = null;
                }
                checkBox2.setEnabled(!z);
            }
        });
        CheckBox checkBox2 = this.W;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        checkBox2.setOnCheckedChangeListener(new qcz(this, 1));
        TextView textView = this.X;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new z01(this, 4));
        TextView textView2 = this.X;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, !jo());
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) requireArguments().getParcelable("album");
        EditText editText = this.U;
        if (editText == null) {
            editText = null;
        }
        editText.setText((goodAlbumEditFlowEntity == null || (str = goodAlbumEditFlowEntity.c) == null) ? null : drm0.p0(str).toString());
        MarketAlbumImagePickerView marketAlbumImagePickerView3 = this.T;
        if (marketAlbumImagePickerView3 == null) {
            marketAlbumImagePickerView3 = null;
        }
        marketAlbumImagePickerView3.setDefaultPhoto(goodAlbumEditFlowEntity != null ? goodAlbumEditFlowEntity.e : null);
        CheckBox checkBox3 = this.V;
        if (checkBox3 == null) {
            checkBox3 = null;
        }
        checkBox3.setChecked(goodAlbumEditFlowEntity != null ? goodAlbumEditFlowEntity.g : false);
        CheckBox checkBox4 = this.W;
        (checkBox4 != null ? checkBox4 : null).setChecked(goodAlbumEditFlowEntity != null ? goodAlbumEditFlowEntity.h : false);
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i = MarketEditAlbumCoverFragment.d0;
            MarketEditAlbumCoverFragment.this.lo(false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
