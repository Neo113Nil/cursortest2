package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.n1;
import androidx.appcompat.widget.t1;
import androidx.appcompat.widget.z0;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class q0 {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final s.n sConstructorMap = new s.n(0);

    public final View a(Context context, String str, String str2) {
        String concat;
        s.n nVar = sConstructorMap;
        Constructor constructor = (Constructor) nVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            nVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public final void b(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public androidx.appcompat.widget.t createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet, com.sports.insider.R.attr.autoCompleteTextViewStyle);
    }

    public androidx.appcompat.widget.v createButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.v(context, attributeSet, com.sports.insider.R.attr.buttonStyle);
    }

    public androidx.appcompat.widget.w createCheckBox(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.w(context, attributeSet, com.sports.insider.R.attr.checkboxStyle);
    }

    @NonNull
    public androidx.appcompat.widget.x createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.x(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.d0 createEditText(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d0(context, attributeSet, com.sports.insider.R.attr.editTextStyle);
    }

    @NonNull
    public androidx.appcompat.widget.g0 createImageButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g0(context, attributeSet, com.sports.insider.R.attr.imageButtonStyle);
    }

    @NonNull
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.i0 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.i0(context, attributeSet);
    }

    public androidx.appcompat.widget.l0 createRadioButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l0(context, attributeSet, com.sports.insider.R.attr.radioButtonStyle);
    }

    @NonNull
    public androidx.appcompat.widget.m0 createRatingBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.m0(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.o0 createSeekBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o0(context, attributeSet);
    }

    @NonNull
    public z0 createSpinner(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public n1 createTextView(Context context, AttributeSet attributeSet) {
        return new n1(context, attributeSet);
    }

    @NonNull
    public t1 createToggleButton(Context context, AttributeSet attributeSet) {
        return new t1(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x01cf
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final android.view.View createView(android.view.View r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull android.util.AttributeSet r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.q0.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }
}
