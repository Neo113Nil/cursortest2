package defpackage;

import java.io.Writer;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ihi extends Writer {
    public final /* synthetic */ int a;
    public final Appendable b;
    public final CharSequence c;

    public ihi(int i, StringBuilder sb) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = new qcp();
                this.b = sb;
                break;
            default:
                this.c = new hhi(1);
                this.b = sb;
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        int i = this.a;
        Appendable appendable = this.b;
        switch (i) {
            case 0:
                appendable.append(charSequence);
                break;
            case 1:
                ((StringBuilder) appendable).append(charSequence);
                break;
            default:
                ((StringBuilder) appendable).append(charSequence);
                break;
        }
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        int i = this.a;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.a;
        Appendable appendable = this.b;
        CharSequence charSequence = this.c;
        switch (i3) {
            case 0:
                hhi hhiVar = (hhi) charSequence;
                hhiVar.b = cArr;
                hhiVar.c = null;
                appendable.append(hhiVar, i, i2 + i);
                break;
            case 1:
                hhi hhiVar2 = (hhi) charSequence;
                hhiVar2.b = cArr;
                hhiVar2.c = null;
                ((StringBuilder) appendable).append((CharSequence) hhiVar2, i, i2 + i);
                break;
            default:
                qcp qcpVar = (qcp) charSequence;
                qcpVar.a = cArr;
                qcpVar.b = null;
                ((StringBuilder) appendable).append((CharSequence) qcpVar, i, i2 + i);
                break;
        }
    }

    private final void h() {
    }

    private final void k() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void p() {
    }

    private final void t() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        switch (this.a) {
            case 0:
                this.b.append(charSequence);
                break;
            case 1:
                append(charSequence);
                break;
            default:
                append(charSequence);
                break;
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        int i3 = this.a;
        Appendable appendable = this.b;
        switch (i3) {
            case 0:
                appendable.append(charSequence, i, i2);
                break;
            case 1:
                ((StringBuilder) appendable).append(charSequence, i, i2);
                break;
            default:
                ((StringBuilder) appendable).append(charSequence, i, i2);
                break;
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.append(charSequence, i, i2);
                break;
            case 1:
                append(charSequence, i, i2);
                break;
            default:
                append(charSequence, i, i2);
                break;
        }
        return this;
    }

    public ihi(Appendable appendable) {
        this.a = 0;
        this.c = new hhi(0);
        this.b = appendable;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = this.a;
        Appendable appendable = this.b;
        switch (i3) {
            case 0:
                Objects.requireNonNull(str);
                appendable.append(str, i, i2 + i);
                break;
            case 1:
                Objects.requireNonNull(str);
                ((StringBuilder) appendable).append((CharSequence) str, i, i2 + i);
                break;
            default:
                Objects.requireNonNull(str);
                ((StringBuilder) appendable).append((CharSequence) str, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        int i2 = this.a;
        Appendable appendable = this.b;
        switch (i2) {
            case 0:
                appendable.append((char) i);
                break;
            case 1:
                ((StringBuilder) appendable).append((char) i);
                break;
            default:
                ((StringBuilder) appendable).append((char) i);
                break;
        }
    }
}
