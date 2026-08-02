package q0;

/* renamed from: q0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8954i {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(x1.InterfaceC10628c r9, kotlin.coroutines.jvm.internal.a r10) {
        /*
            boolean r0 = r10 instanceof q0.C8951f
            if (r0 == 0) goto L13
            r0 = r10
            q0.f r0 = (q0.C8951f) r0
            int r1 = r0.f81312f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81312f = r1
            goto L18
        L13:
            q0.f r0 = new q0.f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f81311e
            Wc.a r1 = Wc.a.COROUTINE_SUSPENDED
            int r2 = r0.f81312f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x1.c r9 = r0.f81310d
            Sc.s.b(r10)
            goto L41
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            Sc.s.b(r10)
        L34:
            r0.f81310d = r9
            r0.f81312f = r3
            x1.o r10 = x1.EnumC10640o.Main
            java.lang.Object r10 = r9.i0(r10, r0)
            if (r10 != r1) goto L41
            return r1
        L41:
            x1.m r10 = (x1.C10638m) r10
            int r2 = r10.a()
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r2 = r10.b()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L72
            java.lang.Object r7 = r2.get(r6)
            x1.x r7 = (x1.x) r7
            boolean r8 = r7.n()
            if (r8 != 0) goto L34
            boolean r8 = r7.j()
            if (r8 != 0) goto L34
            boolean r7 = r7.g()
            if (r7 == 0) goto L34
            int r6 = r6 + 1
            goto L55
        L72:
            java.util.List r9 = r10.b()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C8954i.a(x1.c, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }
}
