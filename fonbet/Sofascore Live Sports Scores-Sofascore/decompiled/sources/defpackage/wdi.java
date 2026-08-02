package defpackage;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wdi implements InputConnection {
    public final c40 a;
    public final i1d b = new i1d(new Function1[16], 0);
    public final b4a c;

    public wdi(c40 c40Var, EditorInfo editorInfo) {
        this.a = c40Var;
        vdi vdiVar = new vdi(this, false);
        omf omfVar = new omf(this, 2);
        vha.H(editorInfo, "editorInfo must be non-null");
        this.c = new b4a(vdiVar, omfVar);
    }

    public final m9j a() {
        return ((jwj) this.a.d).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((fig) this.a.b).a++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.n();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return this.c.commitContent(inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.m(new pu9(charSequence.toString(), i, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        c40 c40Var = this.a;
        c40Var.m(new ou9(i, i2, c40Var, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.m(new nu9(i, i2, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((fig) this.a.b).a();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.m(new yo9(10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), pej.g(a().d), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        m9j a = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a.c.length();
        extractedText.partialStartOffset = -1;
        long j = a.d;
        extractedText.selectionStart = pej.g(j);
        extractedText.selectionEnd = pej.f(j);
        extractedText.flags = !StringsKt.K(a, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (pej.d(a().d)) {
            return null;
        }
        m9j a = a();
        return a.c.subSequence(pej.g(a.d), pej.f(a.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        m9j a = a();
        long j = a.d;
        CharSequence charSequence = a.c;
        int f = pej.f(j);
        int f2 = pej.f(a.d);
        int i3 = f2 + i;
        if (((f2 ^ i3) & (i ^ i3)) < 0) {
            i3 = charSequence.length();
        }
        return charSequence.subSequence(f, Math.min(i3, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        m9j a = a();
        int g = pej.g(a.d);
        int i3 = g - i;
        if (((i ^ g) & (g ^ i3)) < 0) {
            i3 = 0;
        }
        return a.c.subSequence(Math.max(0, i3), pej.g(a.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                int length = a().c.length();
                c40 c40Var = this.a;
                c40Var.m(new ou9(c40Var, 0, length));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performEditorAction(int i) {
        int i2;
        Function1 function1;
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
            }
            function1 = (Function1) this.a.f;
            if (function1 != null) {
                function1.invoke(new lu9(i2));
            }
            return true;
        }
        i2 = 1;
        function1 = (Function1) this.a.f;
        if (function1 != null) {
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            return;
        }
        if (i2 >= 34) {
            c40 c40Var = this.a;
            i = q9.z((jwj) c40Var.d, handwritingGesture, (cej) c40Var.i, (Function0) c40Var.j, (hsk) c40Var.k);
        } else {
            i = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new j90(intConsumer, i, 1));
        } else {
            intConsumer.accept(i);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i < 34 || i < 34) {
            return false;
        }
        c40 c40Var = this.a;
        return q9.B((jwj) c40Var.d, previewableHandwritingGesture, (cej) c40Var.i, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        CursorAnchorInfo a;
        u84 u84Var = (u84) this.a.h;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
                u84Var.a = z2;
                u84Var.b = z3;
                u84Var.c = z4;
                u84Var.d = z;
                if (z5 && (a = u84Var.a()) != null) {
                    z41 z41Var = (z41) u84Var.g;
                    z41Var.x().updateCursorAnchorInfo((View) z41Var.b, a);
                }
                g9i g9iVar = (g9i) u84Var.i;
                if (z6) {
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    u84Var.i = null;
                    return true;
                }
                if (g9iVar != null && g9iVar.isActive()) {
                    return true;
                }
                u84Var.i = xw3.L((ku3) u84Var.h, null, nu3.d, new q3(u84Var, null, 18), 1);
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z4 = true;
            } else {
                z = z4;
                z4 = true;
            }
            z2 = z4;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        u84Var.a = z2;
        u84Var.b = z3;
        u84Var.c = z4;
        u84Var.d = z;
        if (z5) {
            z41 z41Var2 = (z41) u84Var.g;
            z41Var2.x().updateCursorAnchorInfo((View) z41Var2.b, a);
        }
        g9i g9iVar2 = (g9i) u84Var.i;
        if (z6) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        z41 z41Var = (z41) this.a.e;
        z41Var.x().dispatchKeyEventFromInputMethod((View) z41Var.b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        c40 c40Var = this.a;
        c40Var.m(new ou9(i, i2, c40Var, 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        pwh pwhVar;
        tf8 tf8Var;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String obj = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj2 : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj2 instanceof BackgroundColorSpan) {
                    pwhVar = new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, hkg.b(((BackgroundColorSpan) obj2).getBackgroundColor()), (v8j) null, (qah) null, 63487);
                } else if (obj2 instanceof ForegroundColorSpan) {
                    pwhVar = new pwh(hkg.b(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534);
                } else if (obj2 instanceof StrikethroughSpan) {
                    pwhVar = new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.d, (qah) null, 61439);
                } else if (obj2 instanceof StyleSpan) {
                    int style = ((StyleSpan) obj2).getStyle();
                    if (style == 1) {
                        pwhVar = new pwh(0L, 0L, wg8.j, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65531);
                    } else if (style != 2) {
                        if (style == 3) {
                            pwhVar = new pwh(0L, 0L, wg8.j, new rg8(1), (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65523);
                        }
                        pwhVar = null;
                    } else {
                        pwhVar = new pwh(0L, 0L, (wg8) null, new rg8(1), (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65527);
                    }
                } else if (obj2 instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                    String family = typefaceSpan.getFamily();
                    if (Intrinsics.c(family, "cursive")) {
                        tf8Var = tf8.e;
                    } else if (Intrinsics.c(family, "monospace")) {
                        tf8Var = tf8.d;
                    } else if (Intrinsics.c(family, C.SANS_SERIF_NAME)) {
                        tf8Var = tf8.b;
                    } else if (Intrinsics.c(family, C.SERIF_NAME)) {
                        tf8Var = tf8.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 != null && family2.length() != 0) {
                            Typeface create = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (Intrinsics.c(create, typeface) || Intrinsics.c(create, Typeface.create(typeface, 0))) {
                                create = null;
                            }
                            if (create != null) {
                                tf8Var = new tfb(new de0(create, 7));
                            }
                        }
                        tf8Var = null;
                    }
                    pwhVar = new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, tf8Var, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65503);
                } else {
                    if (obj2 instanceof UnderlineSpan) {
                        pwhVar = new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.c, (qah) null, 61439);
                    }
                    pwhVar = null;
                }
                if (pwhVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new p80(pwhVar, spanned.getSpanStart(obj2), spanned.getSpanEnd(obj2)));
                }
            }
            arrayList = arrayList2;
        }
        this.a.m(new y51(obj, arrayList, i, 6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        c40 c40Var = this.a;
        c40Var.m(new ou9(c40Var, i, i2));
        ((Function1) c40Var.g).invoke(Boolean.FALSE);
        return true;
    }
}
