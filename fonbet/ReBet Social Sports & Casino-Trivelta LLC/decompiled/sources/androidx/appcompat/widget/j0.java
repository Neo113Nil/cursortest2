package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.twilio.voice.Constants;
import io.agora.rtc2.internal.RtcEngineEvent;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17329a;

    /* renamed from: b, reason: collision with root package name */
    public final View f17330b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f17331c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f17332d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f17333e;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;

    public j0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f17332d = layoutParams;
        this.f17333e = new Rect();
        this.mTmpAnchorPos = new int[2];
        this.mTmpAppPos = new int[2];
        this.f17329a = context;
        View inflate = LayoutInflater.from(context).inflate(l.g.f55140s, (ViewGroup) null);
        this.f17330b = inflate;
        this.f17331c = (TextView) inflate.findViewById(l.f.f55115t);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = l.i.f55157a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f17329a.getResources().getDimensionPixelOffset(l.d.f55031k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f17329a.getResources().getDimensionPixelOffset(l.d.f55030j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f17329a.getResources().getDimensionPixelOffset(z10 ? l.d.f55033m : l.d.f55032l);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f17333e);
        Rect rect = this.f17333e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f17329a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", Constants.PLATFORM_ANDROID);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f17333e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.mTmpAppPos);
        view.getLocationOnScreen(this.mTmpAnchorPos);
        int[] iArr = this.mTmpAnchorPos;
        int i13 = iArr[0];
        int[] iArr2 = this.mTmpAppPos;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f17330b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f17330b.getMeasuredHeight();
        int i15 = this.mTmpAnchorPos[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z10) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f17333e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f17329a.getSystemService("window")).removeView(this.f17330b);
        }
    }

    public boolean d() {
        return this.f17330b.getParent() != null;
    }

    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f17331c.setText(charSequence);
        a(view, i10, i11, z10, this.f17332d);
        ((WindowManager) this.f17329a.getSystemService("window")).addView(this.f17330b, this.f17332d);
    }
}
