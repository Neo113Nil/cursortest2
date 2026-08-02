package w8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.share.model.ShareContent;
import g6.AbstractC4353m;
import g6.C4331C;
import g6.InterfaceC4350j;

/* renamed from: w8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6724d extends AbstractC4353m {

    /* renamed from: j, reason: collision with root package name */
    public ShareContent f67504j;

    /* renamed from: k, reason: collision with root package name */
    public int f67505k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f67506l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC4350j f67507m;

    /* renamed from: w8.d$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                AbstractC6724d.this.b(view);
                AbstractC6724d.this.getDialog().m(AbstractC6724d.this.getShareContent());
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    public AbstractC6724d(Context context, AttributeSet attributeSet, int i10, String str, String str2) {
        super(context, attributeSet, i10, 0, str, str2);
        this.f67505k = 0;
        this.f67506l = false;
        this.f67505k = isInEditMode() ? 0 : getDefaultRequestCode();
        o(false);
    }

    @Override // g6.AbstractC4353m
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.c(context, attributeSet, i10, i11);
        setInternalOnClickListener(getShareOnClickListener());
    }

    public InterfaceC4350j getCallbackManager() {
        return this.f67507m;
    }

    public abstract C6725e getDialog();

    @Override // g6.AbstractC4353m
    public int getRequestCode() {
        return this.f67505k;
    }

    public ShareContent getShareContent() {
        return this.f67504j;
    }

    public View.OnClickListener getShareOnClickListener() {
        return new a();
    }

    public boolean n() {
        return getDialog().b(getShareContent());
    }

    public final void o(boolean z10) {
        setEnabled(z10);
        this.f67506l = false;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f67506l = true;
    }

    public void setRequestCode(int i10) {
        if (!C4331C.E(i10)) {
            this.f67505k = i10;
            return;
        }
        throw new IllegalArgumentException("Request code " + i10 + " cannot be within the range reserved by the Facebook SDK.");
    }

    public void setShareContent(ShareContent shareContent) {
        this.f67504j = shareContent;
        if (this.f67506l) {
            return;
        }
        o(n());
    }
}
