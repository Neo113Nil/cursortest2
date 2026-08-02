package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k9j extends dti {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9j(int i) {
        super(17);
        this.q = i;
    }

    @Override // defpackage.dti, defpackage.fn5
    public void f(in5 in5Var) {
        switch (this.q) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (true) {
                    if (in5Var.b()) {
                        char a = in5Var.a();
                        in5Var.a++;
                        k(a, sb);
                        if (sb.length() % 3 == 0) {
                            dti.y(in5Var, sb);
                            if (n4o.M(in5Var.a, 3, in5Var.d) != 3) {
                                in5Var.b = 0;
                            }
                        }
                    }
                }
                v(in5Var, sb);
                break;
            default:
                super.f(in5Var);
                break;
        }
    }

    @Override // defpackage.dti
    public final int k(char c, StringBuilder sb) {
        switch (this.q) {
            case 0:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c >= '!' && c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c >= ':' && c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) (c - '`'));
                            return 2;
                        }
                        if (c >= 'A' && c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + k((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        n4o.H(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // defpackage.dti
    public final int r() {
        switch (this.q) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // defpackage.dti
    public void v(in5 in5Var, StringBuilder sb) {
        switch (this.q) {
            case 1:
                StringBuilder sb2 = (StringBuilder) in5Var.f;
                in5Var.d(sb2.length());
                int length = ((hpi) in5Var.g).b - sb2.length();
                in5Var.a -= sb.length();
                String str = in5Var.d;
                if ((str.length() - in5Var.c) - in5Var.a > 1 || length > 1 || (str.length() - in5Var.c) - in5Var.a != length) {
                    in5Var.e((char) 254);
                }
                if (in5Var.b < 0) {
                    in5Var.b = 0;
                    break;
                }
                break;
            default:
                super.v(in5Var, sb);
                break;
        }
    }
}
