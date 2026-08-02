package io.ktor.util;

import io.sentry.protocol.OperatingSystem;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoJvm.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "Ljava/security/MessageDigest;", "delegate", "constructor-impl", "(Ljava/security/MessageDigest;)Ljava/security/MessageDigest;", "", "bytes", "", "plusAssign-impl", "(Ljava/security/MessageDigest;[B)V", "plusAssign", "reset-impl", "(Ljava/security/MessageDigest;)V", "reset", "build-impl", "(Ljava/security/MessageDigest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OperatingSystem.JsonKeys.BUILD, "", "other", "", "equals-impl", "(Ljava/security/MessageDigest;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/security/MessageDigest;)I", "hashCode", "", "toString-impl", "(Ljava/security/MessageDigest;)Ljava/lang/String;", "toString", "Ljava/security/MessageDigest;", "getDelegate", "()Ljava/security/MessageDigest;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
final class DigestImpl implements Digest {
    private final MessageDigest delegate;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DigestImpl m11016boximpl(MessageDigest messageDigest) {
        return new DigestImpl(messageDigest);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MessageDigest m11018constructorimpl(MessageDigest delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return delegate;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11019equalsimpl(MessageDigest messageDigest, Object obj) {
        return (obj instanceof DigestImpl) && Intrinsics.areEqual(messageDigest, ((DigestImpl) obj).m11025unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11020equalsimpl0(MessageDigest messageDigest, MessageDigest messageDigest2) {
        return Intrinsics.areEqual(messageDigest, messageDigest2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11021hashCodeimpl(MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11024toStringimpl(MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    public boolean equals(Object obj) {
        return m11019equalsimpl(this.delegate, obj);
    }

    public int hashCode() {
        return m11021hashCodeimpl(this.delegate);
    }

    public String toString() {
        return m11024toStringimpl(this.delegate);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MessageDigest m11025unboximpl() {
        return this.delegate;
    }

    private /* synthetic */ DigestImpl(MessageDigest messageDigest) {
        this.delegate = messageDigest;
    }

    public final MessageDigest getDelegate() {
        return this.delegate;
    }

    @Override // io.ktor.util.Digest
    public void plusAssign(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        m11022plusAssignimpl(this.delegate, bytes);
    }

    /* renamed from: plusAssign-impl, reason: not valid java name */
    public static void m11022plusAssignimpl(MessageDigest messageDigest, byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        messageDigest.update(bytes);
    }

    @Override // io.ktor.util.Digest
    public void reset() {
        m11023resetimpl(this.delegate);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static void m11023resetimpl(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    /* renamed from: build-impl, reason: not valid java name */
    public static Object m11017buildimpl(MessageDigest messageDigest, Continuation<? super byte[]> continuation) {
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return digest;
    }

    @Override // io.ktor.util.Digest
    public Object build(Continuation<? super byte[]> continuation) {
        return m11017buildimpl(this.delegate, continuation);
    }
}
