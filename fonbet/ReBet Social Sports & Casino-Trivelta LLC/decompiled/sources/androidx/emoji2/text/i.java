package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final f.j f19760a;

    /* renamed from: b, reason: collision with root package name */
    public final n f19761b;

    /* renamed from: c, reason: collision with root package name */
    public f.e f19762c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19763d;
    private final int[] mEmojiAsDefaultStyleExceptions;

    public static final class a {
        public static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        public static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public r f19764a;

        /* renamed from: b, reason: collision with root package name */
        public final f.j f19765b;

        public b(r rVar, f.j jVar) {
            this.f19764a = rVar;
            this.f19765b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f19764a == null) {
                this.f19764a = new r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f19764a.setSpan(this.f19765b.a(pVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r getResult() {
            return this.f19764a;
        }
    }

    public interface c {
        boolean a(CharSequence charSequence, int i10, int i11, p pVar);

        Object getResult();
    }

    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f19766a;

        public d(String str) {
            this.f19766a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f19766a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f19767a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final n.a f19768b;

        /* renamed from: c, reason: collision with root package name */
        public n.a f19769c;

        /* renamed from: d, reason: collision with root package name */
        public n.a f19770d;

        /* renamed from: e, reason: collision with root package name */
        public int f19771e;

        /* renamed from: f, reason: collision with root package name */
        public int f19772f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f19773g;
        private final int[] mEmojiAsDefaultStyleExceptions;

        public e(n.a aVar, boolean z10, int[] iArr) {
            this.f19768b = aVar;
            this.f19769c = aVar;
            this.f19773g = z10;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        public static boolean d(int i10) {
            return i10 == 65039;
        }

        public static boolean f(int i10) {
            return i10 == 65038;
        }

        public int a(int i10) {
            n.a a10 = this.f19769c.a(i10);
            int i11 = 2;
            if (this.f19767a != 2) {
                if (a10 == null) {
                    i11 = g();
                } else {
                    this.f19767a = 2;
                    this.f19769c = a10;
                    this.f19772f = 1;
                }
            } else if (a10 != null) {
                this.f19769c = a10;
                this.f19772f++;
            } else if (f(i10)) {
                i11 = g();
            } else if (!d(i10)) {
                if (this.f19769c.b() != null) {
                    i11 = 3;
                    if (this.f19772f != 1) {
                        this.f19770d = this.f19769c;
                        g();
                    } else if (h()) {
                        this.f19770d = this.f19769c;
                        g();
                    } else {
                        i11 = g();
                    }
                } else {
                    i11 = g();
                }
            }
            this.f19771e = i10;
            return i11;
        }

        public p b() {
            return this.f19769c.b();
        }

        public p c() {
            return this.f19770d.b();
        }

        public boolean e() {
            if (this.f19767a != 2 || this.f19769c.b() == null) {
                return false;
            }
            return this.f19772f > 1 || h();
        }

        public final int g() {
            this.f19767a = 1;
            this.f19769c = this.f19768b;
            this.f19772f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f19769c.b().j() || d(this.f19771e)) {
                return true;
            }
            if (this.f19773g) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.f19769c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set set) {
        this.f19760a = jVar;
        this.f19761b = nVar;
        this.f19762c = eVar;
        this.f19763d = z10;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        g(set);
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(max, min, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    public static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final boolean d(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f19762c.a(charSequence, i10, i11, pVar.h()));
        }
        return pVar.d() == 2;
    }

    public final void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:64:0x000e, B:67:0x0013, B:69:0x0017, B:71:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:63:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        r rVar;
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        o oVar;
        j[] jVarArr;
        boolean z11 = charSequence instanceof o;
        if (z11) {
            ((o) charSequence).a();
        }
        try {
            if (!z11) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        rVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, j.class) > i11) ? null : new r(charSequence);
                        if (rVar != null && (jVarArr = (j[]) rVar.getSpans(i10, i11, j.class)) != null && jVarArr.length > 0) {
                            for (j jVar : jVarArr) {
                                int spanStart = rVar.getSpanStart(jVar);
                                int spanEnd = rVar.getSpanEnd(jVar);
                                if (spanStart != i11) {
                                    rVar.removeSpan(jVar);
                                }
                                i10 = Math.min(spanStart, i10);
                                i11 = Math.max(spanEnd, i11);
                            }
                        }
                        i13 = i10;
                        i14 = i11;
                        if (i13 != i14 || i13 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (z11) {
                                return charSequence2;
                            }
                            oVar = (o) charSequence2;
                        } else {
                            if (i12 != Integer.MAX_VALUE && rVar != null) {
                                i12 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
                            }
                            charSequence2 = charSequence;
                            try {
                                r rVar2 = (r) i(charSequence2, i13, i14, i12, z10, new b(rVar, this.f19760a));
                                if (rVar2 == null) {
                                    if (z11) {
                                        oVar = (o) charSequence2;
                                    }
                                    return charSequence2;
                                }
                                Spannable b10 = rVar2.b();
                                if (z11) {
                                    ((o) charSequence2).d();
                                }
                                return b10;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                if (!z11) {
                                }
                            }
                        }
                        oVar.d();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    charSequence2 = charSequence;
                    if (!z11) {
                    }
                }
            }
            rVar = new r((Spannable) charSequence);
            if (rVar != null) {
                while (r6 < r5) {
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14) {
            }
            charSequence2 = charSequence;
            if (z11) {
            }
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th2 = th;
            if (!z11) {
                throw th2;
            }
            ((o) charSequence2).d();
            throw th2;
        }
    }

    public final Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int i13;
        e eVar = new e(this.f19761b.f(), this.f19763d, this.mEmojiAsDefaultStyleExceptions);
        int i14 = 0;
        boolean z11 = true;
        int codePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            i13 = i10;
            while (i10 < i11 && i14 < i12 && z11) {
                int a10 = eVar.a(codePointAt);
                if (a10 == 1) {
                    i13 += Character.charCount(Character.codePointAt(charSequence, i13));
                    if (i13 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                    i10 = i13;
                } else if (a10 == 2) {
                    i10 += Character.charCount(codePointAt);
                    if (i10 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (a10 == 3) {
                    if (z10 || !d(charSequence, i13, i10, eVar.c())) {
                        z11 = cVar.a(charSequence, i13, i10, eVar.c());
                        i14++;
                    }
                }
            }
        }
        if (eVar.e() && i14 < i12 && z11 && (z10 || !d(charSequence, i13, i10, eVar.b()))) {
            cVar.a(charSequence, i13, i10, eVar.b());
        }
        return cVar.getResult();
    }
}
