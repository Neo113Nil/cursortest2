package com.vk.money.createtransfer.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.core.view.ConstrainedLinearLayout;
import com.vk.core.view.PhotoStripView;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.log.L;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.money.ui.avatar.MoneyAvatarView;
import com.vk.movika.sdk.android.defaultplayer.control.i;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.ci0;
import xsna.cm1;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.hij0;
import xsna.iah0;
import xsna.in70;
import xsna.jjc;
import xsna.kjp0;
import xsna.krv0;
import xsna.m33;
import xsna.oa01;
import xsna.ozv;
import xsna.pro0;
import xsna.qcy;
import xsna.r4;
import xsna.scg0;
import xsna.sua;
import xsna.tgw;
import xsna.u1u0;
import xsna.wqo0;
import xsna.xim0;
import xsna.yka0;

/* compiled from: TransferInputFieldView.kt */
/* loaded from: classes3.dex */
public final class TransferInputFieldView extends ConstrainedLinearLayout implements TransferInputField {
    public static final /* synthetic */ int p = 0;
    public final TextView d;
    public final MoneyAvatarView e;
    public final EditText f;
    public final EditText g;
    public final TextView h;
    public final View i;
    public final TextView j;
    public final View k;
    public final PhotoStripView l;
    public String m;
    public TransferInputField.a n;
    public final Drawable o;

    /* compiled from: TransferInputFieldView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferInputField.EditableTarget.values().length];
            try {
                iArr[TransferInputField.EditableTarget.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferInputField.EditableTarget.COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TransferInputFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        a(attributeSet);
        this.m = "";
        this.o = dhr0.w(R.drawable.group_placeholder, context);
        LayoutInflater.from(context).inflate(R.layout.money_transfer_input_form, this);
        this.d = (TextView) findViewById(R.id.tv_mt_to);
        this.e = (MoneyAvatarView) findViewById(R.id.iv_mt_to);
        TextView textView = (TextView) findViewById(R.id.tv_mt_restriction);
        this.h = textView;
        EditText editText = (EditText) findViewById(R.id.et_mt_sum);
        this.f = editText;
        this.i = findViewById(R.id.ll_mt_sum);
        EditText editText2 = (EditText) findViewById(R.id.et_mt_comment);
        this.g = editText2;
        TextView textView2 = (TextView) findViewById(R.id.tv_mt_hint);
        this.j = textView2;
        this.k = findViewById(R.id.iv_unlimited);
        this.l = (PhotoStripView) findViewById(R.id.psv_mt_to);
        setBackground(m33.a(R.drawable.bg_money_chat_request, context));
        setOrientation(1);
        textView2.setOnClickListener(new r4(this, 11));
        editText.setOnClickListener(new ci0(this, 12));
        in70 in70Var = new in70();
        DecimalFormat decimalFormat = new DecimalFormat();
        in70Var.b = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        in70Var.c = editText;
        editText.addTextChangedListener(in70Var);
        oa01.a(editText, new hij0(this, 9));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.jjp0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    int i2 = TransferInputFieldView.p;
                    return false;
                }
                TransferInputField.a aVar = TransferInputFieldView.this.n;
                if (aVar == null) {
                    return true;
                }
                aVar.f();
                return true;
            }
        });
        oa01.a(editText2, new xim0(this, 3));
        jjc.g(textView, new yka0(this, 15));
    }

    @Override // android.view.ViewGroup, android.view.View, com.vk.money.createtransfer.input.TransferInputField
    public final void clearFocus() {
        super.clearFocus();
        this.f.clearFocus();
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public String getRestrictionText() {
        return this.h.getText().toString();
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void n1() {
        EditText editText = this.f;
        editText.requestFocus();
        editText.setSelection(editText.getText().length());
        Activity h = e3m.h(getContext());
        if (h == null) {
            return;
        }
        int[] iArr = u1u0.a;
        int rotation = h.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        h.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = 9;
        if (((rotation == 0 || rotation == 2) && i2 > i) || ((rotation == 1 || rotation == 3) && i > i2)) {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            L.l("vk", tgw.b(rotation, "Unknown screen orientation ", ". Defaulting to portrait."));
                        }
                        i3 = 8;
                    }
                }
                i3 = 0;
            }
            i3 = 1;
        } else {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            L.l("vk", tgw.b(rotation, "Unknown screen orientation ", ". Defaulting to landscape."));
                        }
                        i3 = 1;
                    }
                    i3 = 8;
                }
            }
            i3 = 0;
        }
        pro0.c(new kjp0(this, i3, 0));
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void o1() {
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.k.setVisibility(8);
        n1();
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void p1() {
        TextView textView = this.h;
        textView.setVisibility(0);
        textView.setText(R.string.money_transfer_request_no_limit);
        textView.setTextColor(getContext().getColor(R.color.vk_gray_300));
        this.i.setVisibility(8);
        this.k.setVisibility(0);
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void q1(TransferInputField.EditableTarget editableTarget, int i) {
        EditText editText;
        int i2 = a.$EnumSwitchMapping$0[editableTarget.ordinal()];
        if (i2 == 1) {
            editText = this.f;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            editText = this.g;
        }
        editText.setImeOptions(i);
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void r1(Dialog dialog, ProfilesInfo profilesInfo) {
        ProfilesSimpleInfo Ob = profilesInfo.Ob();
        ozv.a.getClass();
        wqo0 wqo0Var = ozv.d;
        int i = 0;
        qcy<Object> qcyVar = ozv.b[0];
        wqo0Var.getClass();
        String d = ((DisplayNameFormatter) wqo0Var.get()).d(dialog, Ob);
        TextView textView = this.d;
        textView.setText(d);
        Uri parse = Uri.parse(ozv.b(dialog, profilesInfo.Ob()));
        boolean f = epx.f(parse.getScheme(), "vkchatphoto");
        MoneyAvatarView moneyAvatarView = this.e;
        if (!f) {
            f4m.s(iah0.a(3), textView);
            moneyAvatarView.e1(dialog, profilesInfo, this.o);
            moneyAvatarView.setContentDescription(getContext().getString(R.string.money_transfer_content_description_proceed_to_chat, d));
            moneyAvatarView.setOnClickListener(new i(4, this, dialog));
            return;
        }
        f4m.j(moneyAvatarView);
        f4m.s(iah0.a(8), textView);
        PhotoStripView photoStripView = this.l;
        photoStripView.setOverlapOffset(0.8f);
        photoStripView.setPadding(iah0.a(2));
        photoStripView.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        String queryParameter = parse.getQueryParameter("photo0");
        while (queryParameter != null && i < 4) {
            arrayList.add(queryParameter);
            i++;
            queryParameter = parse.getQueryParameter("photo" + i);
        }
        photoStripView.l(-1, arrayList);
        photoStripView.setContentDescription(getContext().getString(R.string.money_transfer_content_description_proceed_to_chat, d));
        photoStripView.setOnClickListener(new cm1(6, this, dialog));
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void s1(TransferInputField.EditableTarget editableTarget, InputFilter[] inputFilterArr) {
        EditText editText;
        int i = a.$EnumSwitchMapping$0[editableTarget.ordinal()];
        if (i == 1) {
            editText = this.f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            editText = this.g;
        }
        editText.setFilters(inputFilterArr);
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public void setCallback(TransferInputField.a aVar) {
        this.n = aVar;
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public void setComment(String str) {
        this.g.setText(str);
    }

    public void setCurrencySign(String str) {
        this.m = str;
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public void setRestriction(scg0 scg0Var) {
        String string;
        if (scg0Var instanceof scg0.d) {
            string = getContext().getString(R.string.money_transfer_min, sua.j(new BigDecimal(((scg0.d) scg0Var).a), ',') + ' ' + this.m);
        } else if (scg0Var instanceof scg0.c) {
            string = getContext().getString(R.string.money_transfer_max, sua.j(new BigDecimal(((scg0.c) scg0Var).a), ',') + ' ' + this.m);
        } else if (scg0Var instanceof scg0.g) {
            string = getContext().getString(R.string.money_insufficient_restriction);
        } else if (scg0Var instanceof scg0.b) {
            string = getContext().getString(R.string.money_will_transfer_amount_with_fee, sua.i(((scg0.b) scg0Var).a * 100, JwtParser.SEPARATOR_CHAR) + ' ' + this.m);
        } else if (scg0Var instanceof scg0.f) {
            string = getContext().getString(R.string.money_will_transfer_amount_no_fee);
        } else {
            if (!(scg0Var instanceof scg0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            string = getContext().getString(R.string.money_will_request_amount, sua.j(new BigDecimal(((scg0.e) scg0Var).a), ',') + ' ' + this.m);
        }
        int i = scg0Var instanceof scg0.a ? R.attr.colorError : R.attr.vk_legacy_text_tertiary;
        TypedValue typedValue = krv0.a;
        TextView textView = this.h;
        krv0.q(textView, i);
        textView.setText(string);
    }

    @Override // com.vk.money.createtransfer.input.TransferInputField
    public final void t1(String str, boolean z) {
        EditText editText = this.f;
        editText.setText(str);
        if (z) {
            editText.setSelection(editText.getText().length());
        }
    }
}
