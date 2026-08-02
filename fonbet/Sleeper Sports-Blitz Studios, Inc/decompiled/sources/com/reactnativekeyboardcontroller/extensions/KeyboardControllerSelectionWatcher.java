package com.reactnativekeyboardcontroller.extensions;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditText.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u008b\u0001\u0010\u0004\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0093\u0001\u0010\u0004\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/reactnativekeyboardcontroller/extensions/KeyboardControllerSelectionWatcher;", "", "editText", "Landroid/widget/EditText;", "action", "Lkotlin/Function6;", "", "Lkotlin/ParameterName;", "name", "start", "end", "", "startX", "startY", "endX", "endY", "", "<init>", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function6;)V", "lastSelectionStart", "lastSelectionEnd", "lastEditTextHeight", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setup", "destroy", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KeyboardControllerSelectionWatcher {
    private final Function6<Integer, Integer, Double, Double, Double, Double, Unit> action;
    private final EditText editText;
    private int lastEditTextHeight;
    private int lastSelectionEnd;
    private int lastSelectionStart;
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardControllerSelectionWatcher(EditText editText, Function6<? super Integer, ? super Integer, ? super Double, ? super Double, ? super Double, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(action, "action");
        this.editText = editText;
        this.action = action;
        this.lastSelectionStart = -1;
        this.lastSelectionEnd = -1;
        this.lastEditTextHeight = -1;
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.reactnativekeyboardcontroller.extensions.KeyboardControllerSelectionWatcher$preDrawListener$1
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
            
                if (r7 != r3) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
            
                r11 = r4.getTextCursorDrawable();
             */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onPreDraw() {
                EditText editText2;
                EditText editText3;
                EditText editText4;
                EditText editText5;
                int i;
                EditText editText6;
                EditText editText7;
                EditText editText8;
                EditText editText9;
                EditText editText10;
                int paddingTop;
                int i2;
                Function6 function6;
                EditText editText11;
                EditText editText12;
                EditText editText13;
                Drawable textCursorDrawable;
                int i3;
                int i4;
                editText2 = KeyboardControllerSelectionWatcher.this.editText;
                int selectionStart = editText2.getSelectionStart();
                editText3 = KeyboardControllerSelectionWatcher.this.editText;
                int selectionEnd = editText3.getSelectionEnd();
                editText4 = KeyboardControllerSelectionWatcher.this.editText;
                int height = editText4.getHeight();
                editText5 = KeyboardControllerSelectionWatcher.this.editText;
                Layout layout = editText5.getLayout();
                if (layout == null) {
                    return true;
                }
                i = KeyboardControllerSelectionWatcher.this.lastSelectionStart;
                if (i == selectionStart) {
                    i3 = KeyboardControllerSelectionWatcher.this.lastSelectionEnd;
                    if (i3 == selectionEnd) {
                        i4 = KeyboardControllerSelectionWatcher.this.lastEditTextHeight;
                    }
                }
                KeyboardControllerSelectionWatcher.this.lastSelectionStart = selectionStart;
                KeyboardControllerSelectionWatcher.this.lastSelectionEnd = selectionEnd;
                KeyboardControllerSelectionWatcher.this.lastEditTextHeight = height;
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                int lineTop = layout.getLineTop(layout.getLineForOffset(min));
                int height2 = layout.getHeight();
                int i5 = 0;
                if (Build.VERSION.SDK_INT >= 29 && textCursorDrawable != null) {
                    i5 = textCursorDrawable.getIntrinsicWidth();
                }
                editText6 = KeyboardControllerSelectionWatcher.this.editText;
                int gravity = editText6.getGravity() & 112;
                editText7 = KeyboardControllerSelectionWatcher.this.editText;
                int paddingTop2 = editText7.getPaddingTop();
                editText8 = KeyboardControllerSelectionWatcher.this.editText;
                int paddingBottom = paddingTop2 + editText8.getPaddingBottom();
                editText9 = KeyboardControllerSelectionWatcher.this.editText;
                int lineHeight = editText9.getLineHeight() / 2;
                int i6 = height - paddingBottom;
                if (height2 > i6) {
                    editText10 = KeyboardControllerSelectionWatcher.this.editText;
                    paddingTop = editText10.getPaddingTop();
                } else if (gravity == 16) {
                    int i7 = (i6 - height2) / 2;
                    editText11 = KeyboardControllerSelectionWatcher.this.editText;
                    paddingTop = i7 + editText11.getPaddingTop();
                } else if (gravity != 80) {
                    editText13 = KeyboardControllerSelectionWatcher.this.editText;
                    paddingTop = editText13.getPaddingTop();
                } else {
                    editText12 = KeyboardControllerSelectionWatcher.this.editText;
                    i2 = editText12.getPaddingTop() + (i6 - height2) + lineHeight;
                    float primaryHorizontal = layout.getPrimaryHorizontal(min);
                    float scrollY = (lineTop + i2) - editText5.getScrollY();
                    int lineForOffset = layout.getLineForOffset(max);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(max);
                    float lineBottom = (layout.getLineBottom(lineForOffset) + i2) - editText5.getScrollY();
                    function6 = KeyboardControllerSelectionWatcher.this.action;
                    function6.invoke(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(FloatKt.getDp(primaryHorizontal)), Double.valueOf(FloatKt.getDp(scrollY)), Double.valueOf(FloatKt.getDp(primaryHorizontal2 + i5)), Double.valueOf(FloatKt.getDp(lineBottom)));
                    return true;
                }
                i2 = paddingTop + lineHeight;
                float primaryHorizontal3 = layout.getPrimaryHorizontal(min);
                float scrollY2 = (lineTop + i2) - editText5.getScrollY();
                int lineForOffset2 = layout.getLineForOffset(max);
                float primaryHorizontal22 = layout.getPrimaryHorizontal(max);
                float lineBottom2 = (layout.getLineBottom(lineForOffset2) + i2) - editText5.getScrollY();
                function6 = KeyboardControllerSelectionWatcher.this.action;
                function6.invoke(Integer.valueOf(selectionStart), Integer.valueOf(selectionEnd), Double.valueOf(FloatKt.getDp(primaryHorizontal3)), Double.valueOf(FloatKt.getDp(scrollY2)), Double.valueOf(FloatKt.getDp(primaryHorizontal22 + i5)), Double.valueOf(FloatKt.getDp(lineBottom2)));
                return true;
            }
        };
    }

    public final void setup() {
        this.editText.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    public final void destroy() {
        this.editText.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
    }
}
