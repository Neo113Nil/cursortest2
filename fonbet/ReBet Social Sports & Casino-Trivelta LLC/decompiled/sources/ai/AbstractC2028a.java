package ai;

import Zh.InterfaceC1901b;
import di.A0;
import di.C;
import di.C4076B;
import di.C4084d0;
import di.C4087f;
import di.C4091h;
import di.C4093i;
import di.C4094i0;
import di.C4096j0;
import di.C4097k;
import di.C4099l;
import di.C4100l0;
import di.C4109q;
import di.C4117u0;
import di.C4119v0;
import di.D;
import di.L;
import di.M;
import di.S0;
import di.V;
import di.X;
import di.X0;
import di.Y;
import di.Y0;
import di.Z0;
import di.f1;
import di.i1;
import di.j1;
import di.l1;
import di.m1;
import di.o1;
import di.p1;
import di.r;
import di.r1;
import di.s1;
import di.t1;
import di.u1;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;

/* renamed from: ai.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2028a {
    public static final InterfaceC1901b A(ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return C4099l.f45383a;
    }

    public static final InterfaceC1901b B(CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return r.f45407a;
    }

    public static final InterfaceC1901b C(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return C.f45283a;
    }

    public static final InterfaceC1901b D(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return M.f45315a;
    }

    public static final InterfaceC1901b E(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return Y.f45337a;
    }

    public static final InterfaceC1901b F(LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return C4096j0.f45375a;
    }

    public static final InterfaceC1901b G(ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return Y0.f45339a;
    }

    public static final InterfaceC1901b H(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return Z0.f45341a;
    }

    public static final InterfaceC1901b I(Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return D.f45285a;
    }

    public static final InterfaceC1901b J(Instant.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return V.f45331a;
    }

    public static final InterfaceC1901b K(Uuid.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return u1.f45427a;
    }

    public static final InterfaceC1901b a(KClass kClass, InterfaceC1901b elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new S0(kClass, elementSerializer);
    }

    public static final InterfaceC1901b b() {
        return C4091h.f45367c;
    }

    public static final InterfaceC1901b c() {
        return C4097k.f45379c;
    }

    public static final InterfaceC1901b d() {
        return C4109q.f45405c;
    }

    public static final InterfaceC1901b e() {
        return C4076B.f45281c;
    }

    public static final InterfaceC1901b f() {
        return L.f45314c;
    }

    public static final InterfaceC1901b g() {
        return X.f45335c;
    }

    public static final InterfaceC1901b h(InterfaceC1901b elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C4087f(elementSerializer);
    }

    public static final InterfaceC1901b i() {
        return C4094i0.f45372c;
    }

    public static final InterfaceC1901b j(InterfaceC1901b keySerializer, InterfaceC1901b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C4100l0(keySerializer, valueSerializer);
    }

    public static final InterfaceC1901b k(InterfaceC1901b keySerializer, InterfaceC1901b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C4084d0(keySerializer, valueSerializer);
    }

    public static final InterfaceC1901b l() {
        return C4117u0.f45425a;
    }

    public static final InterfaceC1901b m(InterfaceC1901b keySerializer, InterfaceC1901b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new A0(keySerializer, valueSerializer);
    }

    public static final InterfaceC1901b n() {
        return X0.f45336c;
    }

    public static final InterfaceC1901b o(InterfaceC1901b aSerializer, InterfaceC1901b bSerializer, InterfaceC1901b cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new f1(aSerializer, bSerializer, cSerializer);
    }

    public static final InterfaceC1901b p() {
        return i1.f45373c;
    }

    public static final InterfaceC1901b q() {
        return l1.f45388c;
    }

    public static final InterfaceC1901b r() {
        return o1.f45401c;
    }

    public static final InterfaceC1901b s() {
        return r1.f45409c;
    }

    public static final InterfaceC1901b t(InterfaceC1901b interfaceC1901b) {
        Intrinsics.checkNotNullParameter(interfaceC1901b, "<this>");
        return interfaceC1901b.getDescriptor().b() ? interfaceC1901b : new C4119v0(interfaceC1901b);
    }

    public static final InterfaceC1901b u(UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return j1.f45377a;
    }

    public static final InterfaceC1901b v(UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return m1.f45394a;
    }

    public static final InterfaceC1901b w(ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return p1.f45403a;
    }

    public static final InterfaceC1901b x(UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return s1.f45412a;
    }

    public static final InterfaceC1901b y(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return t1.f45421b;
    }

    public static final InterfaceC1901b z(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return C4093i.f45370a;
    }
}
