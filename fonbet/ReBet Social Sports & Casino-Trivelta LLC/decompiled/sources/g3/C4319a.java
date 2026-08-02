package g3;

import co.nstant.in.cbor.decoder.c;
import co.nstant.in.cbor.decoder.f;
import co.nstant.in.cbor.decoder.g;
import co.nstant.in.cbor.decoder.i;
import co.nstant.in.cbor.decoder.j;
import co.nstant.in.cbor.decoder.k;
import co.nstant.in.cbor.decoder.l;
import h3.AbstractC4437f;
import h3.AbstractC4444m;
import h3.C4434c;
import h3.C4440i;
import h3.C4445n;
import h3.C4451t;
import h3.C4452u;
import h3.EnumC4441j;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4319a {
    private static /* synthetic */ int[] $SWITCH_TABLE$co$nstant$in$cbor$model$MajorType;

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f46872a;

    /* renamed from: b, reason: collision with root package name */
    public final l f46873b;

    /* renamed from: c, reason: collision with root package name */
    public final g f46874c;

    /* renamed from: d, reason: collision with root package name */
    public final c f46875d;

    /* renamed from: e, reason: collision with root package name */
    public final k f46876e;

    /* renamed from: f, reason: collision with root package name */
    public final co.nstant.in.cbor.decoder.b f46877f;

    /* renamed from: g, reason: collision with root package name */
    public final f f46878g;

    /* renamed from: h, reason: collision with root package name */
    public final j f46879h;

    /* renamed from: i, reason: collision with root package name */
    public final i f46880i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f46881j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f46882k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f46883l = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f46884m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f46885n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46886o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46887p = false;

    public C4319a(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        this.f46872a = inputStream;
        this.f46873b = new l(this, inputStream);
        this.f46874c = new g(this, inputStream);
        this.f46875d = new c(this, inputStream);
        this.f46876e = new k(this, inputStream);
        this.f46877f = new co.nstant.in.cbor.decoder.b(this, inputStream);
        this.f46878g = new f(this, inputStream);
        this.f46879h = new j(this, inputStream);
        this.f46880i = new i(this, inputStream);
    }

    public static /* synthetic */ int[] a() {
        int[] iArr = $SWITCH_TABLE$co$nstant$in$cbor$model$MajorType;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC4441j.values().length];
        try {
            iArr2[EnumC4441j.ARRAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC4441j.BYTE_STRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC4441j.INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC4441j.MAP.ordinal()] = 7;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC4441j.NEGATIVE_INTEGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC4441j.SPECIAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC4441j.TAG.ordinal()] = 8;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC4441j.UNICODE_STRING.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC4441j.UNSIGNED_INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        $SWITCH_TABLE$co$nstant$in$cbor$model$MajorType = iArr2;
        return iArr2;
    }

    public static List c(byte[] bArr) {
        return new C4319a(new ByteArrayInputStream(bArr)).b();
    }

    public List b() {
        LinkedList linkedList = new LinkedList();
        while (true) {
            AbstractC4437f e10 = e();
            if (e10 == null) {
                return linkedList;
            }
            linkedList.add(e10);
        }
    }

    public final AbstractC4437f d(AbstractC4437f abstractC4437f) {
        if (!(abstractC4437f instanceof C4434c)) {
            throw new C4320b("Error decoding LanguageTaggedString: not an array");
        }
        C4434c c4434c = (C4434c) abstractC4437f;
        if (c4434c.i().size() != 2) {
            throw new C4320b("Error decoding LanguageTaggedString: array size is not 2");
        }
        AbstractC4437f abstractC4437f2 = (AbstractC4437f) c4434c.i().get(0);
        if (!(abstractC4437f2 instanceof C4452u)) {
            throw new C4320b("Error decoding LanguageTaggedString: first data item is not an UnicodeString");
        }
        AbstractC4437f abstractC4437f3 = (AbstractC4437f) c4434c.i().get(1);
        if (abstractC4437f3 instanceof C4452u) {
            return new C4440i((C4452u) abstractC4437f2, (C4452u) abstractC4437f3);
        }
        throw new C4320b("Error decoding LanguageTaggedString: second data item is not an UnicodeString");
    }

    public AbstractC4437f e() {
        try {
            int read = this.f46872a.read();
            if (read == -1) {
                return null;
            }
            switch (a()[EnumC4441j.a(read).ordinal()]) {
                case 2:
                    return this.f46873b.g(read);
                case 3:
                    return this.f46874c.g(read);
                case 4:
                    return this.f46875d.g(read);
                case 5:
                    return this.f46876e.g(read);
                case 6:
                    return this.f46877f.g(read);
                case 7:
                    return this.f46878g.g(read);
                case 8:
                    C4451t g10 = this.f46879h.g(read);
                    AbstractC4437f e10 = e();
                    if (e10 == null) {
                        throw new C4320b("Unexpected end of stream: tag without following data item.");
                    }
                    if (this.f46885n && g10.f() == 30) {
                        return f(e10);
                    }
                    if (this.f46886o && g10.f() == 38) {
                        return d(e10);
                    }
                    AbstractC4437f abstractC4437f = e10;
                    while (abstractC4437f.c()) {
                        abstractC4437f = abstractC4437f.b();
                    }
                    abstractC4437f.e(g10);
                    return e10;
                case 9:
                    return this.f46880i.g(read);
                default:
                    throw new C4320b("Not implemented major type " + read);
            }
        } catch (IOException e11) {
            throw new C4320b(e11);
        }
    }

    public final AbstractC4437f f(AbstractC4437f abstractC4437f) {
        if (!(abstractC4437f instanceof C4434c)) {
            throw new C4320b("Error decoding RationalNumber: not an array");
        }
        C4434c c4434c = (C4434c) abstractC4437f;
        if (c4434c.i().size() != 2) {
            throw new C4320b("Error decoding RationalNumber: array size is not 2");
        }
        AbstractC4437f abstractC4437f2 = (AbstractC4437f) c4434c.i().get(0);
        if (!(abstractC4437f2 instanceof AbstractC4444m)) {
            throw new C4320b("Error decoding RationalNumber: first data item is not a number");
        }
        AbstractC4437f abstractC4437f3 = (AbstractC4437f) c4434c.i().get(1);
        if (abstractC4437f3 instanceof AbstractC4444m) {
            return new C4445n((AbstractC4444m) abstractC4437f2, (AbstractC4444m) abstractC4437f3);
        }
        throw new C4320b("Error decoding RationalNumber: second data item is not a number");
    }

    public boolean g() {
        return this.f46881j;
    }

    public boolean h() {
        return this.f46883l;
    }

    public boolean i() {
        return this.f46882k;
    }

    public boolean j() {
        return this.f46884m;
    }

    public boolean k() {
        return this.f46887p;
    }
}
