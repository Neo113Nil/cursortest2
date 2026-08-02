package com.vk.network.websocket.internal;

import com.vk.network.eventhub.impl.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.u;
import okio.ByteString;
import xsna.emb;
import xsna.j1n;
import xsna.phx0;
import xsna.szp;
import xsna.uhx0;

/* compiled from: VkWebSocketListenerAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends uhx0 {
    public final b b;
    public final szp c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final boolean e;

    /* compiled from: VkWebSocketListenerAdapter.kt */
    /* renamed from: com.vk.network.websocket.internal.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1365a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusCode.values().length];
            try {
                iArr[StatusCode.ACCESS_TOKEN_EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusCode.INVALID_SAT_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusCode.TOKEN_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusCode.INVALID_ACCESS_TOKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StatusCode.BAD_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StatusCode.AUTHENTICATION_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StatusCode.FLOOD_CONTROL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StatusCode.SERVER_OVERLOADED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(b bVar, szp szpVar, int i) {
        this.b = bVar;
        this.c = szpVar;
        this.e = i == 3;
    }

    public final void a(int i, String str) {
        Object obj;
        j1n eVar;
        StatusCode.Companion.getClass();
        Iterator<E> it = StatusCode.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((StatusCode) obj).h() == i) {
                    break;
                }
            }
        }
        StatusCode statusCode = (StatusCode) obj;
        if (statusCode == null) {
            statusCode = StatusCode.UNKNOWN;
        }
        switch (C1365a.$EnumSwitchMapping$0[statusCode.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                eVar = new j1n.e(i, str);
                break;
            case 5:
            case 6:
                eVar = new j1n.d(i, str);
                break;
            case 7:
            case 8:
                eVar = j1n.c.a;
                break;
            default:
                eVar = new j1n.a(i, str);
                break;
        }
        this.b.b(eVar);
    }

    @Override // xsna.uhx0
    public final void onClosed(phx0 phx0Var, int i, String str) {
        szp szpVar = this.c;
        szpVar.a("VkWebSocketListenerAdapter.onClosed(code=" + i + ", reason=" + str + ')');
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), (398 & 1) != 0 ? null : phx0Var.request(), null, null, null, (398 & 16) != 0 ? null : Integer.valueOf(i), (398 & 32) != 0 ? null : str, (398 & 64) != 0 ? null : "onClosed", null, null);
        if (this.d.compareAndSet(true, false)) {
            a(i, str);
        }
    }

    @Override // xsna.uhx0
    public final void onClosing(phx0 phx0Var, int i, String str) {
        szp szpVar = this.c;
        szpVar.a("VkWebSocketListenerAdapter.onClosing(code=" + i + ", reason=" + str + ')');
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), (414 & 1) != 0 ? null : phx0Var.request(), null, null, null, null, (414 & 32) != 0 ? null : str, (414 & 64) != 0 ? null : "onClosing", null, null);
        if (this.d.compareAndSet(true, false)) {
            a(i, str);
        }
    }

    @Override // xsna.uhx0
    public final void onFailure(phx0 phx0Var, Throwable th, u uVar) {
        boolean z = th instanceof IOException;
        b bVar = this.b;
        szp szpVar = this.c;
        if (z) {
            StringBuilder sb = new StringBuilder("VkWebSocketListenerAdapter.onFailure(response.message=");
            sb.append(uVar != null ? uVar.d : null);
            sb.append(')');
            szpVar.a(sb.toString());
            bVar.b(new j1n.b(th));
        } else {
            szpVar.b(th, "VkWebSocketListenerAdapter.onFailure(response=" + uVar + ')');
            bVar.b(new j1n.f(th));
        }
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), (444 & 1) != 0 ? null : phx0Var.request(), (444 & 2) != 0 ? null : uVar, null, null, null, null, (444 & 64) != 0 ? null : "onFailure", null, null);
    }

    @Override // xsna.uhx0
    public final void onMessage(phx0 phx0Var, ByteString byteString) {
        boolean z = this.e;
        boolean z2 = false;
        AtomicBoolean atomicBoolean = this.d;
        if (z && !atomicBoolean.get() && byteString.s(0) == 0 && new String(byteString.z(), emb.b).equals("\u0000{\"result\":{\"status\":200},\"id\":null}")) {
            z2 = true;
        }
        szp szpVar = this.c;
        szpVar.a("VkWebSocketListenerAdapter.onMessage(bytes=" + byteString + ')');
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), (438 & 1) != 0 ? null : phx0Var.request(), null, null, (438 & 8) != 0 ? null : byteString, null, null, (438 & 64) != 0 ? null : "onMessage", null, null);
        byteString.n();
        new String(byteString.z(), emb.b);
        b bVar = this.b;
        if (!z2) {
            bVar.c(byteString);
        } else {
            bVar.a();
            atomicBoolean.set(true);
        }
    }

    @Override // xsna.uhx0
    public final void onOpen(phx0 phx0Var, u uVar) {
        szp szpVar = this.c;
        szpVar.a("VkWebSocketListenerAdapter.onOpen(response=" + uVar + ')');
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), (444 & 1) != 0 ? null : phx0Var.request(), (444 & 2) != 0 ? null : uVar, null, null, null, null, (444 & 64) != 0 ? null : "onOpen", null, null);
        if (this.e) {
            return;
        }
        this.b.a();
        this.d.set(true);
    }

    @Override // xsna.uhx0
    public final void onMessage(phx0 phx0Var, String str) {
        szp szpVar = this.c;
        szpVar.a("VkWebSocketListenerAdapter.onMessage(text=" + str + ')');
        szpVar.b.a.b(Long.valueOf(szpVar.a.incrementAndGet()), (442 & 1) != 0 ? null : phx0Var.request(), null, (442 & 4) != 0 ? null : str, null, null, null, (442 & 64) != 0 ? null : "onMessage", null, null);
        ByteString byteString = new ByteString(str.getBytes(emb.b));
        byteString.c = str;
        this.b.c(byteString);
    }
}
