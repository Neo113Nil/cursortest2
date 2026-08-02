package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.c;
import androidx.emoji2.text.g;
import java.util.Iterator;
import java.util.Set;
import xsna.jup0;
import xsna.kup0;
import xsna.mdp;
import xsna.ri20;
import xsna.xdp;
import xsna.z4q0;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes12.dex */
public final class e {

    @NonNull
    public final c.j a;

    @NonNull
    public final g b;

    @NonNull
    public final c.e c;

    /* compiled from: EmojiProcessor.java */
    public static class a implements b<z4q0> {

        @Nullable
        public z4q0 a;
        public final c.j b;

        public a(@Nullable z4q0 z4q0Var, c.j jVar) {
            this.a = z4q0Var;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.e.b
        public final boolean a(@NonNull CharSequence charSequence, int i, int i2, jup0 jup0Var) {
            if ((jup0Var.c & 4) > 0) {
                return true;
            }
            if (this.a == null) {
                this.a = new z4q0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((c.d) this.b).getClass();
            this.a.setSpan(new kup0(jup0Var), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.e.b
        public final z4q0 getResult() {
            return this.a;
        }
    }

    /* compiled from: EmojiProcessor.java */
    public interface b<T> {
        boolean a(@NonNull CharSequence charSequence, int i, int i2, jup0 jup0Var);

        T getResult();
    }

    /* compiled from: EmojiProcessor.java */
    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static final class C0030e {
        public int a = 1;
        public final g.a b;
        public g.a c;
        public g.a d;
        public int e;
        public int f;

        public C0030e(g.a aVar) {
            this.b = aVar;
            this.c = aVar;
        }

        public final void a() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }

        public final boolean b() {
            ri20 b = this.c.b.b();
            int a = b.a(6);
            return !(a == 0 || b.b.get(a + b.a) == 0) || this.e == 65039;
        }
    }

    public e(@NonNull g gVar, @NonNull c.d dVar, @NonNull androidx.emoji2.text.b bVar, @NonNull Set set) {
        this.a = dVar;
        this.b = gVar;
        this.c = bVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            e(str, 0, str.length(), 1, true, new d(str));
        }
    }

    public static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        xdp[] xdpVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xdpVarArr = (xdp[]) editable.getSpans(selectionStart, selectionEnd, xdp.class)) != null && xdpVarArr.length > 0) {
                for (xdp xdpVar : xdpVarArr) {
                    int spanStart = editable.getSpanStart(xdpVar);
                    int spanEnd = editable.getSpanEnd(xdpVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(@NonNull mdp mdpVar, @NonNull Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                xdp[] xdpVarArr = (xdp[]) editable.getSpans(selectionStart, min, xdp.class);
                if (xdpVarArr != null && xdpVarArr.length > 0) {
                    for (xdp xdpVar : xdpVarArr) {
                        int spanStart = editable.getSpanStart(xdpVar);
                        int spanEnd = editable.getSpanEnd(xdpVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    mdpVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    mdpVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(@NonNull Editable editable, int i, @NonNull KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public final boolean d(CharSequence charSequence, int i, int i2, jup0 jup0Var) {
        if ((jup0Var.c & 3) == 0) {
            c.e eVar = this.c;
            ri20 b2 = jup0Var.b();
            int a2 = b2.a(8);
            if (a2 != 0) {
                b2.b.getShort(a2 + b2.a);
            }
            androidx.emoji2.text.b bVar = (androidx.emoji2.text.b) eVar;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.b.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = bVar.a.hasGlyph(sb.toString());
            int i3 = jup0Var.c & 4;
            jup0Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (jup0Var.c & 3) == 2;
    }

    public final <T> T e(@NonNull CharSequence charSequence, int i, int i2, int i3, boolean z, b<T> bVar) {
        int i4;
        char c2;
        C0030e c0030e = new C0030e(this.b.c);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray<g.a> sparseArray = c0030e.c.a;
                g.a aVar = sparseArray == null ? null : sparseArray.get(codePointAt);
                if (c0030e.a == 2) {
                    if (aVar != null) {
                        c0030e.c = aVar;
                        c0030e.f++;
                    } else {
                        if (codePointAt == 65038) {
                            c0030e.a();
                        } else if (codePointAt != 65039) {
                            g.a aVar2 = c0030e.c;
                            if (aVar2.b != null) {
                                if (c0030e.f != 1) {
                                    c0030e.d = aVar2;
                                    c0030e.a();
                                } else if (c0030e.b()) {
                                    c0030e.d = c0030e.c;
                                    c0030e.a();
                                } else {
                                    c0030e.a();
                                }
                                c2 = 3;
                            } else {
                                c0030e.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (aVar == null) {
                    c0030e.a();
                    c2 = 1;
                } else {
                    c0030e.a = 2;
                    c0030e.c = aVar;
                    c0030e.f = 1;
                    c2 = 2;
                }
                c0030e.e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z || !d(charSequence, i4, i6, c0030e.d.b)) {
                        z2 = bVar.a(charSequence, i4, i6, c0030e.d.b);
                        i5++;
                    }
                }
            }
        }
        if (c0030e.a == 2 && c0030e.c.b != null && ((c0030e.f > 1 || c0030e.b()) && i5 < i3 && z2 && (z || !d(charSequence, i4, i6, c0030e.c.b)))) {
            bVar.a(charSequence, i4, i6, c0030e.c.b);
        }
        return bVar.getResult();
    }

    /* compiled from: EmojiProcessor.java */
    public static class c implements b<c> {
        public final int a;
        public int b = -1;
        public int c = -1;

        public c(int i) {
            this.a = i;
        }

        @Override // androidx.emoji2.text.e.b
        public final boolean a(@NonNull CharSequence charSequence, int i, int i2, jup0 jup0Var) {
            int i3 = this.a;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.b = i;
            this.c = i2;
            return false;
        }

        @Override // androidx.emoji2.text.e.b
        public final c getResult() {
            return this;
        }
    }

    /* compiled from: EmojiProcessor.java */
    public static class d implements b<d> {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.e.b
        public final boolean a(@NonNull CharSequence charSequence, int i, int i2, jup0 jup0Var) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            jup0Var.c = (jup0Var.c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.e.b
        public final d getResult() {
            return this;
        }
    }
}
