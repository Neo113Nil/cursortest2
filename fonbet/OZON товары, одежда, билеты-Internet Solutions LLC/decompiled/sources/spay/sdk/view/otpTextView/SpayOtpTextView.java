package spay.sdk.view.otpTextView;

import C.o0;
import Km0.a;
import Ve.C4782y9;
import Ve.E;
import Ve.Ga;
import Ve.InterfaceC4122ba;
import Ve.W4;
import Ve.W8;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lspay/sdk/view/otpTextView/SpayOtpTextView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LVe/W8;", "spayOtpChildEditText", "", "setTextWatcher", "(LVe/W8;)V", "setFocusDetection", "length", "setFocus", "(I)V", "", "s", "setOTP", "(Ljava/lang/CharSequence;)V", "", "otp", "(Ljava/lang/String;)V", "Landroid/view/View$OnTouchListener;", "l", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "LVe/ba;", "c", "LVe/ba;", "getSpayOtpListener", "()LVe/ba;", "setSpayOtpListener", "(LVe/ba;)V", "spayOtpListener", "Landroid/text/InputFilter;", "getFilter", "()Landroid/text/InputFilter;", "filter", "getOtp", "()Ljava/lang/String;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpayOtpTextView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f98898a;

    /* renamed from: b, reason: collision with root package name */
    public W8 f98899b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public InterfaceC4122ba spayOtpListener;

    /* renamed from: d, reason: collision with root package name */
    public boolean f98901d;

    /* renamed from: e, reason: collision with root package name */
    public String f98902e;

    /* renamed from: f, reason: collision with root package name */
    public int f98903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayOtpTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98902e = "";
        a(null);
    }

    private final InputFilter getFilter() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFocus(int length) {
        ArrayList arrayList = this.f98898a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 == length) {
                    W8 w82 = this.f98899b;
                    if (w82 == null || !w82.isFocused()) {
                        ((C4782y9) arrayList.get(i11)).b(0);
                    } else {
                        ((C4782y9) arrayList.get(i11)).b(1);
                    }
                } else {
                    ((C4782y9) arrayList.get(i11)).b(0);
                }
            }
            if (length == arrayList.size()) {
                ((C4782y9) o0.b(1, arrayList)).b(1);
            }
        }
    }

    private final void setFocusDetection(W8 spayOtpChildEditText) {
        if (spayOtpChildEditText == null) {
            return;
        }
        spayOtpChildEditText.setOnFocusChangeListener(new Dk0.a(this, 1));
    }

    private final void setTextWatcher(W8 spayOtpChildEditText) {
        if (spayOtpChildEditText != null) {
            spayOtpChildEditText.addTextChangedListener(new Ga(this));
        }
    }

    public final String getOtp() {
        Editable text;
        W8 w82 = this.f98899b;
        if (w82 == null || (text = w82.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final InterfaceC4122ba getSpayOtpListener() {
        return this.spayOtpListener;
    }

    public final void setOTP(@NotNull CharSequence s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        ArrayList arrayList = this.f98898a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 < s11.length()) {
                    if (this.f98901d) {
                        this.f98901d = false;
                    }
                    C4782y9.a((C4782y9) arrayList.get(i11), String.valueOf(s11.charAt(i11)), i11 + 1 == s11.length(), false, this.f98902e.length() > s11.length(), 4);
                } else {
                    C4782y9.a((C4782y9) arrayList.get(i11), "", false, this.f98901d, this.f98902e.length() > s11.length(), 2);
                }
            }
            this.f98902e = s11.toString();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@NotNull View.OnTouchListener l11) {
        Intrinsics.checkNotNullParameter(l11, "l");
        super.setOnTouchListener(l11);
        W8 w82 = this.f98899b;
        if (w82 != null) {
            w82.setOnTouchListener(l11);
        }
    }

    public final void setSpayOtpListener(InterfaceC4122ba interfaceC4122ba) {
        this.spayOtpListener = interfaceC4122ba;
    }

    public static final CharSequence a(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        while (i11 < i12) {
            if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(charSequence.charAt(i11))).matches()) {
                return "";
            }
            i11++;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayOtpTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98902e = "";
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpayOtpTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.SpayOtpTextView)");
        this.f98903f = obtainStyledAttributes.getInt(R.styleable.SpayOtpTextView_spay_length, 4);
        this.f98898a = new ArrayList();
        if (this.f98903f > 0) {
            String string = obtainStyledAttributes.getString(R.styleable.SpayOtpTextView_spay_otp);
            int i11 = R.styleable.SpayOtpTextView_spay_width;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            int dimension = (int) obtainStyledAttributes.getDimension(i11, E.a(48, context));
            int i12 = R.styleable.SpayOtpTextView_spay_height;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            int dimension2 = (int) obtainStyledAttributes.getDimension(i12, E.a(48, context2));
            int i13 = R.styleable.SpayOtpTextView_spay_box_margin;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            int dimension3 = (int) obtainStyledAttributes.getDimension(i13, E.a(-1, context3));
            int i14 = R.styleable.SpayOtpTextView_spay_box_margin_left;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            int dimension4 = (int) obtainStyledAttributes.getDimension(i14, E.a(4, context4));
            int i15 = R.styleable.SpayOtpTextView_spay_box_margin_right;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            int dimension5 = (int) obtainStyledAttributes.getDimension(i15, E.a(4, context5));
            int i16 = R.styleable.SpayOtpTextView_spay_box_margin_top;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            int dimension6 = (int) obtainStyledAttributes.getDimension(i16, E.a(4, context6));
            int i17 = R.styleable.SpayOtpTextView_spay_box_margin_bottom;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "context");
            int dimension7 = (int) obtainStyledAttributes.getDimension(i17, E.a(4, context7));
            if (obtainStyledAttributes.getBoolean(R.styleable.SpayOtpTextView_spay_otp_box_match_parent, false)) {
                layoutParams = new LinearLayout.LayoutParams(dimension, dimension2, 1.0f);
            } else {
                layoutParams = new LinearLayout.LayoutParams(dimension, dimension2);
            }
            if (dimension3 > 0) {
                layoutParams.setMargins(dimension3, dimension3, dimension3, dimension3);
            } else {
                layoutParams.setMargins(dimension4, dimension6, dimension5, dimension7);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "context");
            Intrinsics.checkNotNullParameter(context8, "context");
            W8 w82 = new W8(context8);
            w82.setCursorVisible(false);
            w82.setTextColor(context8.getResources().getColor(R.color.spay_transparent));
            w82.setBackgroundDrawable(null);
            w82.setInputType(2);
            w82.setSelectAllOnFocus(false);
            w82.setTextIsSelectable(false);
            this.f98899b = w82;
            w82.setFilters(new InputFilter[]{getFilter(), new InputFilter.LengthFilter(this.f98903f)});
            setTextWatcher(this.f98899b);
            setFocusDetection(this.f98899b);
            addView(this.f98899b, layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout, layoutParams3);
            int i18 = this.f98903f;
            for (int i19 = 0; i19 < i18; i19++) {
                Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "context");
                C4782y9 c4782y9 = new C4782y9(context9, attributeSet);
                c4782y9.b(0);
                linearLayout.addView(c4782y9, i19, layoutParams);
                ArrayList arrayList = this.f98898a;
                if (arrayList != null) {
                    arrayList.add(c4782y9);
                }
            }
            if (string != null) {
                setOTP(string);
            } else {
                setOTP("");
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw W4.f30245a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayOtpTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98902e = "";
        a(attributeSet);
    }

    public final void setOTP(@NotNull String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        W8 w82 = this.f98899b;
        if (w82 != null) {
            w82.setText(otp);
        }
    }

    public static final void a(SpayOtpTextView this$0, View view, boolean z11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.isFocused()) {
            String otp = this$0.getOtp();
            if (otp != null) {
                this$0.setFocus(otp.length());
                return;
            }
            return;
        }
        if (this$0.getOtp() != null) {
            this$0.setFocus(-1);
        }
    }
}
