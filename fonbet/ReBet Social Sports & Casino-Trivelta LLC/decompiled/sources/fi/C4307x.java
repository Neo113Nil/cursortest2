package fi;

import ci.AbstractC2928a;
import ei.AbstractC4212b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;

/* renamed from: fi.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4307x extends AbstractC2928a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4285a f46786b;

    /* renamed from: c, reason: collision with root package name */
    public final gi.e f46787c;

    public C4307x(AbstractC4285a lexer, AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f46786b = lexer;
        this.f46787c = json.a();
    }

    @Override // ci.AbstractC2928a, ci.e
    public byte I() {
        AbstractC4285a abstractC4285a = this.f46786b;
        String s10 = abstractC4285a.s();
        try {
            return UStringsKt.toUByte(s10);
        } catch (IllegalArgumentException unused) {
            AbstractC4285a.z(abstractC4285a, "Failed to parse type 'UByte' for input '" + s10 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ci.c
    public gi.e a() {
        return this.f46787c;
    }

    @Override // ci.c
    public int e(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // ci.AbstractC2928a, ci.e
    public int k() {
        AbstractC4285a abstractC4285a = this.f46786b;
        String s10 = abstractC4285a.s();
        try {
            return UStringsKt.toUInt(s10);
        } catch (IllegalArgumentException unused) {
            AbstractC4285a.z(abstractC4285a, "Failed to parse type 'UInt' for input '" + s10 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ci.AbstractC2928a, ci.e
    public long p() {
        AbstractC4285a abstractC4285a = this.f46786b;
        String s10 = abstractC4285a.s();
        try {
            return UStringsKt.toULong(s10);
        } catch (IllegalArgumentException unused) {
            AbstractC4285a.z(abstractC4285a, "Failed to parse type 'ULong' for input '" + s10 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ci.AbstractC2928a, ci.e
    public short v() {
        AbstractC4285a abstractC4285a = this.f46786b;
        String s10 = abstractC4285a.s();
        try {
            return UStringsKt.toUShort(s10);
        } catch (IllegalArgumentException unused) {
            AbstractC4285a.z(abstractC4285a, "Failed to parse type 'UShort' for input '" + s10 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
