package com.vk.core.view.search;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.acw0;
import xsna.ape0;
import xsna.bcw0;
import xsna.cv1;
import xsna.izs;
import xsna.jjc;
import xsna.l850;
import xsna.l9a0;
import xsna.ngw;
import xsna.ozl;
import xsna.s3q0;

/* compiled from: RoundedSearchView.kt */
@ozl
/* loaded from: classes17.dex */
public final class RoundedSearchView extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public final ImageView b;
    public final ImageView c;
    public final EditText d;
    public c e;
    public View.OnClickListener f;
    public izs<? super String, s3q0> g;
    public izs<? super String, s3q0> h;
    public boolean i;
    public final acw0 j;

    public RoundedSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRightDrawable() {
        Editable text;
        EditText editText = this.d;
        return (editText == null || (text = editText.getText()) == null || text.length() != 0) ? R.drawable.vk_icon_cancel_24 : R.drawable.vk_icon_voice_outline_24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRightIconContentDescription() {
        Editable text;
        Context context = getContext();
        EditText editText = this.d;
        return context.getString((editText == null || (text = editText.getText()) == null || text.length() != 0) ? R.string.accessibility_clear_input : R.string.accessibility_voice_search);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRightIconVisibility() {
        Editable text;
        EditText editText = this.d;
        return (editText == null || (text = editText.getText()) == null || text.length() != 0 || this.i) ? 0 : 4;
    }

    public final izs<String, s3q0> getOnActionSearchListener() {
        return this.g;
    }

    public final View.OnClickListener getOnActionSearchQueryClick() {
        return this.f;
    }

    public final izs<String, s3q0> getOnTextChangedListener() {
        return this.h;
    }

    public final String getQuery() {
        Editable text;
        String obj;
        EditText editText = this.d;
        return (editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final boolean getVoiceIsAvailable() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dispose();
    }

    public final void setEditMode(bcw0 bcw0Var) {
        EditText editText = this.d;
        if (editText != null) {
            editText.setText("");
            editText.setVisibility(0);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(getRightDrawable());
            imageView.setContentDescription(getRightIconContentDescription());
            jjc.g(imageView, new cv1(this, imageView, bcw0Var, 5));
        }
    }

    public final void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        EditText editText = this.d;
        if (editText != null) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
    }

    public final void setHint(int i) {
        EditText editText = this.d;
        if (editText != null) {
            editText.setHint(i);
        }
    }

    public final void setHintTextColor(int i) {
        EditText editText = this.d;
        if (editText != null) {
            editText.setHintTextColor(i);
        }
    }

    public final void setOnActionSearchListener(izs<? super String, s3q0> izsVar) {
        this.g = izsVar;
    }

    public final void setOnActionSearchQueryClick(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final void setOnTextChangedListener(izs<? super String, s3q0> izsVar) {
        this.h = izsVar;
    }

    public final void setQuery(String str) {
        EditText editText = this.d;
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(editText.getText().length());
        }
    }

    public final void setVoiceIsAvailable(boolean z) {
        this.i = z;
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    public RoundedSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.e = EmptyDisposable.INSTANCE;
        this.i = true;
        acw0 acw0Var = new acw0(new l850(this, 6));
        this.j = acw0Var;
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.view_rounded_search, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.search_icon);
        this.c = (ImageView) findViewById(R.id.right_icon);
        EditText editText = (EditText) findViewById(R.id.query);
        editText.setOnFocusChangeListener(new l9a0(this, 1));
        jjc.g(editText, new ape0(this, 2));
        editText.addTextChangedListener(aVar);
        editText.setOnEditorActionListener(new ngw(this, 1));
        this.d = editText;
        setEditMode(acw0Var);
    }

    /* compiled from: RoundedSearchView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            RoundedSearchView roundedSearchView = RoundedSearchView.this;
            if (editable != null) {
                ImageView imageView = roundedSearchView.c;
                if (imageView != null) {
                    imageView.setImageResource(roundedSearchView.getRightDrawable());
                }
                if (imageView != null) {
                    imageView.setContentDescription(roundedSearchView.getRightIconContentDescription());
                }
                if (imageView != null) {
                    imageView.setVisibility(roundedSearchView.getRightIconVisibility());
                }
            }
            izs<String, s3q0> onTextChangedListener = roundedSearchView.getOnTextChangedListener();
            CharSequence charSequence = editable;
            if (onTextChangedListener != null) {
                if (editable == null) {
                    charSequence = "";
                }
                onTextChangedListener.invoke(charSequence.toString());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
