package com.vk.libvideo.design.view.error;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.bwt0;
import xsna.cck0;
import xsna.dhr0;
import xsna.epx;
import xsna.ho8;
import xsna.iah0;
import xsna.krv0;
import xsna.ksq0;
import xsna.msy;
import xsna.qoy;
import xsna.quy;
import xsna.vsy;

/* compiled from: VideoErrorView.kt */
/* loaded from: classes2.dex */
public final class VideoErrorView extends quy<a> {
    public static final /* synthetic */ int g = 0;
    public final String c;
    public final Object d;
    public final Object e;
    public boolean f;

    /* compiled from: VideoErrorView.kt */
    public static final class a {
        public final String a;
        public final View.OnClickListener b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, false, 63);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            View.OnClickListener onClickListener = this.b;
            int b = qoy.b(qoy.b(qoy.b((hashCode + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
            String str2 = this.f;
            return b + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(title=");
            sb.append(this.a);
            sb.append(", listener=");
            sb.append(this.b);
            sb.append(", withLock=");
            sb.append(this.c);
            sb.append(", isOutlineStyle=");
            sb.append(this.d);
            sb.append(", isButtonGone=");
            sb.append(this.e);
            sb.append(", customButtonText=");
            return ho8.a(sb, this.f, ')');
        }

        public /* synthetic */ a(String str, View.OnClickListener onClickListener, boolean z, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : onClickListener, (i & 4) != 0 ? false : z, (i & 8) == 0, false, null);
        }

        public a(String str, View.OnClickListener onClickListener, boolean z, boolean z2, boolean z3, String str2) {
            this.a = str;
            this.b = onClickListener;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = str2;
        }
    }

    public VideoErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getActionView() {
        return (VkButton) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AppCompatTextView getTitleView() {
        return (AppCompatTextView) this.d.getValue();
    }

    @Override // xsna.quy
    public final void b() {
        Context context;
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(getContext(), R.style.VkUiTypography_Headline1));
        appCompatTextView.setId(R.id.retry_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        float f = 16;
        int i = 0;
        appCompatTextView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setGravity(17);
        appCompatTextView.setMaxWidth(iah0.a(480));
        addView(appCompatTextView);
        TypedValue typedValue = krv0.a;
        if (krv0.b == null || (context = dhr0.s()) == null) {
            context = getContext();
        }
        VkButton vkButton = new VkButton(context, null, 6, i);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setId(R.id.retry);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = iah0.a(8);
        vkButton.setLayoutParams(layoutParams);
        setGravity(17);
        vkButton.setText(this.c);
        vkButton.setTag(SignalingTransport.URL_TYPE_RETRY);
        addView(vkButton);
    }

    @Override // xsna.quy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(a aVar) {
        View.OnClickListener onClickListener = aVar.b;
        if (!this.f || getVisibility() == 0) {
            getTitleView().setText(aVar.a);
            VkButton actionView = getActionView();
            String str = aVar.f;
            if (str == null) {
                str = this.c;
            }
            actionView.setText(str);
            getActionView().setTag(SignalingTransport.URL_TYPE_RETRY);
            if (aVar.c) {
                bwt0.h0(onClickListener, getActionView());
            } else {
                getActionView().setOnClickListener(onClickListener);
            }
            if (aVar.d) {
                getActionView().setMode(VkButton.Mode.Outline);
                getActionView().setAppearance(VkButton.Appearance.Accent);
                getTitleView().setTextSize(2, 16.0f);
            } else {
                getActionView().setMode(VkButton.Mode.Secondary);
                getActionView().setAppearance(VkButton.Appearance.Accent);
                getTitleView().setTextSize(2, 14.0f);
            }
            getActionView().setVisibility(!aVar.e ? 0 : 8);
        }
    }

    public final boolean getShouldBindOnlyWhenVisible() {
        return this.f;
    }

    public final void setShouldBindOnlyWhenVisible(boolean z) {
        this.f = z;
    }

    @Override // xsna.quy, android.view.View
    public void setVisibility(int i) {
        a data;
        int visibility = getVisibility();
        super.setVisibility(i);
        if (!this.f || i == visibility || i != 0 || (data = getData()) == null) {
            return;
        }
        c(data);
    }

    public VideoErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.c = context.getString(R.string.video_error_retry);
        ksq0 ksq0Var = new ksq0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, ksq0Var);
        this.e = msy.a(lazyThreadSafetyMode, new cck0(this, 14));
        this.f = true;
        setOrientation(1);
        setGravity(17);
        this.b.getClass();
        if (vsy.d()) {
            b();
        }
    }
}
