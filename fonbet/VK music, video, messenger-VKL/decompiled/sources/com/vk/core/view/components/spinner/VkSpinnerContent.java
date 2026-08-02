package com.vk.core.view.components.spinner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.asp;
import xsna.cut0;
import xsna.dd6;
import xsna.dko;
import xsna.e3m;
import xsna.e43;
import xsna.gko;
import xsna.gpo0;
import xsna.gzs;
import xsna.m33;
import xsna.p01;
import xsna.pn00;
import xsna.s3q0;
import xsna.s7c0;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkSpinnerContent.kt */
/* loaded from: classes.dex */
public final class VkSpinnerContent extends FrameLayout implements too0 {
    public static final /* synthetic */ int k = 0;
    public SpinnerState b;
    public boolean c;
    public b d;
    public final VkSpinner e;
    public final ImageButton f;
    public final ImageButton g;
    public final ImageView h;
    public final ImageView i;
    public final Object j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkSpinnerContent.kt */
    public static final class SpinnerState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SpinnerState[] $VALUES;
        public static final SpinnerState Custom;
        public static final SpinnerState Done;
        public static final SpinnerState Error;
        public static final SpinnerState Loading;

        static {
            SpinnerState spinnerState = new SpinnerState("Loading", 0);
            Loading = spinnerState;
            SpinnerState spinnerState2 = new SpinnerState("Error", 1);
            Error = spinnerState2;
            SpinnerState spinnerState3 = new SpinnerState("Done", 2);
            Done = spinnerState3;
            SpinnerState spinnerState4 = new SpinnerState("Custom", 3);
            Custom = spinnerState4;
            SpinnerState[] spinnerStateArr = {spinnerState, spinnerState2, spinnerState3, spinnerState4};
            $VALUES = spinnerStateArr;
            $ENTRIES = new asp(spinnerStateArr);
        }

        public SpinnerState() {
            throw null;
        }

        public static zrp<SpinnerState> h() {
            return $ENTRIES;
        }

        public static SpinnerState valueOf(String str) {
            return (SpinnerState) Enum.valueOf(SpinnerState.class, str);
        }

        public static SpinnerState[] values() {
            return (SpinnerState[]) $VALUES.clone();
        }
    }

    /* compiled from: VkSpinnerContent.kt */
    /* loaded from: classes17.dex */
    public interface a {

        /* compiled from: VkSpinnerContent.kt */
        /* renamed from: com.vk.core.view.components.spinner.VkSpinnerContent$a$a, reason: collision with other inner class name */
        public static final class C0864a implements a {
            public final gko a;
            public final s7c0 b;

            public C0864a() {
                throw null;
            }

            public C0864a(gko gkoVar, s7c0 s7c0Var) {
                this.a = gkoVar;
                this.b = s7c0Var;
            }

            public final dko a() {
                return this.a;
            }

            public final gzs<s3q0> b() {
                return this.b;
            }
        }
    }

    /* compiled from: VkSpinnerContent.kt */
    /* loaded from: classes17.dex */
    public interface b {
        void onCancel();
    }

    /* compiled from: VkSpinnerContent.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkSpinner.SpinnerSize.values().length];
            try {
                iArr[VkSpinner.SpinnerSize.Size16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkSpinner.SpinnerSize.Size24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkSpinner.SpinnerSize.Size28.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkSpinner.SpinnerSize.Size36.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkSpinner.SpinnerSize.Size56.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkSpinnerContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        SpinnerState spinnerState = SpinnerState.Loading;
        this.b = spinnerState;
        this.c = true;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_spinner_content, this);
        VkSpinner vkSpinner = (VkSpinner) findViewById(R.id.spinner);
        this.e = vkSpinner;
        this.f = (ImageButton) findViewById(R.id.cancel_button);
        ImageView imageView = (ImageView) findViewById(R.id.done_icon);
        this.h = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.error_icon);
        this.i = imageView2;
        ImageButton imageButton = (ImageButton) findViewById(R.id.custom_content_button);
        this.g = imageButton;
        this.j = pn00.k(new Pair(spinnerState, vkSpinner), new Pair(SpinnerState.Done, imageView), new Pair(SpinnerState.Error, imageView2), new Pair(SpinnerState.Custom, imageButton));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.B, 0, 0);
        int integer = obtainStyledAttributes.getInteger(1, VkSpinner.SpinnerSize.Size56.ordinal());
        int integer2 = obtainStyledAttributes.getInteger(2, spinnerState.ordinal());
        setContentColorful(obtainStyledAttributes.getBoolean(0, true));
        setSpinnerSize((VkSpinner.SpinnerSize) VkSpinner.SpinnerSize.h().get(integer));
        setSpinnerState((SpinnerState) SpinnerState.h().get(integer2));
        if (this.c) {
            a(gpo0.d(R.attr.vk_ui_icon_medium, this));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // xsna.too0
    public final void Ng() {
        if (this.c) {
            a(gpo0.d(R.attr.vk_ui_icon_medium, this));
        }
    }

    public final void a(int i) {
        this.e.setIndeterminateTintList(ColorStateList.valueOf(i));
        Iterator it = e43.l(this.f, this.h, this.i, this.g).iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setColorFilter(i);
        }
    }

    public final boolean getContentColorful() {
        return this.c;
    }

    public final VkSpinner.SpinnerSize getSpinnerSize() {
        return this.e.getSpinnerSize();
    }

    public final SpinnerState getSpinnerState() {
        return this.b;
    }

    public final void setColor(int i) {
        a(i);
        setContentColorful(false);
    }

    public final void setContentColorful(boolean z) {
        this.c = z;
        if (z) {
            a(gpo0.d(R.attr.vk_ui_icon_medium, this));
        }
    }

    public final void setCustomContent(a aVar) {
        if (!(aVar instanceof a.C0864a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.C0864a c0864a = (a.C0864a) aVar;
        dko a2 = c0864a.a();
        ImageButton imageButton = this.g;
        imageButton.setImageDrawable(((gko) a2).a(imageButton.getContext()));
        imageButton.setOnClickListener(new p01(c0864a, 15));
        imageButton.setImageTintList(this.f.getImageTintList());
        imageButton.setEnabled(c0864a.b() != null);
        imageButton.setContentDescription(null);
    }

    public final void setOnCancelListener(b bVar) {
        this.d = bVar;
        dd6 dd6Var = new dd6(bVar, 10);
        ImageButton imageButton = this.f;
        imageButton.setOnClickListener(dd6Var);
        if (this.b == SpinnerState.Loading) {
            imageButton.setVisibility(bVar != null ? 0 : 8);
        }
    }

    public final void setSpinnerSize(VkSpinner.SpinnerSize spinnerSize) {
        this.e.setSpinnerSize(spinnerSize);
        if (isAttachedToWindow()) {
            int i = c.$EnumSwitchMapping$0[getSpinnerSize().ordinal()];
            ImageView imageView = this.i;
            ImageView imageView2 = this.h;
            if (i == 1) {
                Context context = getContext();
                e3m.a aVar = e3m.a;
                imageView2.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_done_state_16, context));
                imageView.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_error_state_16, getContext()));
                return;
            }
            if (i == 2) {
                Context context2 = getContext();
                e3m.a aVar2 = e3m.a;
                imageView2.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_done_state_24, context2));
                imageView.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_error_state_24, getContext()));
                return;
            }
            if (i == 3) {
                Context context3 = getContext();
                e3m.a aVar3 = e3m.a;
                imageView2.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_done_state_28, context3));
                imageView.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_error_state_28, getContext()));
                return;
            }
            if (i == 4) {
                Context context4 = getContext();
                e3m.a aVar4 = e3m.a;
                imageView2.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_done_state_36, context4));
                imageView.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_error_state_36, getContext()));
                return;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Context context5 = getContext();
            e3m.a aVar5 = e3m.a;
            imageView2.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_done_state_56, context5));
            imageView.setImageDrawable(m33.a(R.drawable.ds_internal_spinner_error_state_56, getContext()));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void setSpinnerState(SpinnerState spinnerState) {
        SpinnerState spinnerState2 = this.b;
        ?? r1 = this.j;
        View view = (View) r1.get(spinnerState2);
        int i = 8;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = (View) r1.get(spinnerState);
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (view2 instanceof ImageView) {
            Object drawable = ((ImageView) view2).getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        if (spinnerState == SpinnerState.Loading && this.d != null) {
            i = 0;
        }
        this.f.setVisibility(i);
        this.b = spinnerState;
    }

    public final void setColor(cut0 cut0Var) {
        setColor(cut0Var.b(getContext()));
    }
}
