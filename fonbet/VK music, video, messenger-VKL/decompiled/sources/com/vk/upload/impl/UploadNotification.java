package com.vk.upload.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.upload.core.utils.EmptyFileUploadException;
import com.vk.upload.core.utils.WrongFileUploadException;
import com.vk.upload.impl.c;
import com.vkontakte.android.R;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.abq0;
import xsna.asp;
import xsna.ca70;
import xsna.cvk;
import xsna.e43;
import xsna.efz;
import xsna.epx;
import xsna.hcq0;
import xsna.oq;
import xsna.ozg0;
import xsna.paq0;
import xsna.shy;
import xsna.sv1;
import xsna.u6x;
import xsna.ysg0;
import xsna.zrp;

/* compiled from: UploadNotification.kt */
/* loaded from: classes6.dex */
public final class UploadNotification implements c.a {
    public c.a b;
    public u6x.a c;
    public final b d;
    public boolean e = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UploadNotification.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DONE;
        public static final State EMPTY;
        public static final State FAILED;
        public static final State PROGRESS;

        static {
            State state = new State("EMPTY", 0);
            EMPTY = state;
            State state2 = new State("PROGRESS", 1);
            PROGRESS = state2;
            State state3 = new State(SignalingProtocol.HUNGUP_REASON_FAILED, 2);
            FAILED = state3;
            State state4 = new State("DONE", 3);
            DONE = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: UploadNotification.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final PendingIntent c;

        public a(PendingIntent pendingIntent, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = pendingIntent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            PendingIntent pendingIntent = this.c;
            return hashCode2 + (pendingIntent != null ? pendingIntent.hashCode() : 0);
        }

        public final String toString() {
            return "Params(title=" + this.a + ", text=" + this.b + ", intent=" + this.c + ')';
        }
    }

    /* compiled from: UploadNotification.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UploadNotification(int i) {
        this.d = new b(i, State.EMPTY, 0, 0, null, null);
    }

    public static void a(NotificationCompat.h hVar, CharSequence charSequence, String str, String str2) {
        hVar.k(charSequence);
        hVar.n(2, true);
        if (str != null) {
            hVar.D(str);
        }
        if (str2 != null) {
            hVar.j(str2);
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        hVar.w = context.getResources().getColor(R.color.vk_blue_400);
    }

    public final void b(com.vk.upload.impl.b bVar, NotificationCompat.h hVar, boolean z) {
        c.a aVar;
        b bVar2 = this.d;
        if (!z && (aVar = this.b) != null) {
            aVar.d(bVar, bVar2.c, bVar2.d, this.e);
        }
        a(hVar, bVar.a0(), "", "");
        hVar.w(bVar2.d, bVar2.c, this.e);
        hVar.I.icon = android.R.drawable.stat_sys_upload;
        hVar.u = NotificationCompat.CATEGORY_PROGRESS;
    }

    public final void c(b bVar) {
        u6x.a aVar = this.c;
        if (aVar != null) {
            aVar.a(bVar.c, bVar.d);
        }
        ysg0.b.a(bVar);
    }

    @Override // com.vk.upload.impl.c.a
    public final void d(com.vk.upload.impl.b<?> bVar, int i, int i2, boolean z) {
        L.e(efz.a(i, i2, "upload progress ", " / "));
        b bVar2 = this.d;
        bVar2.c = i;
        bVar2.d = i2;
        bVar2.b = State.PROGRESS;
        this.e = z;
        ysg0.b.a(new hcq0(bVar.d, i, i2));
        c(new b(bVar2));
    }

    public final void e() {
        ca70 ca70Var = ca70.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        sv1.B(null, 10);
        ca70.f(context).cancel(ca70.e(10));
        b bVar = this.d;
        if (bVar.b != State.FAILED) {
            bVar.b = State.EMPTY;
        }
    }

    public final void f(com.vk.upload.impl.b<?> bVar, Parcelable parcelable) {
        if (bVar.e) {
            return;
        }
        b bVar2 = this.d;
        bVar2.c = 100;
        bVar2.d = 100;
        bVar2.b = State.DONE;
        bVar2.e = parcelable;
        L.e("done: " + bVar2.c + " / " + bVar2.d);
        ysg0.b.a(new paq0(bVar.d, parcelable));
        c(new b(bVar2));
    }

    public final void g(com.vk.upload.impl.b<?> bVar, Exception exc) {
        StringBuilder sb = new StringBuilder("failed: ");
        b bVar2 = this.d;
        sb.append(bVar2.c);
        sb.append(" / ");
        sb.append(bVar2.d);
        sb.append(" error=");
        sb.append(exc);
        L.e(sb.toString());
        bVar2.b = State.FAILED;
        bVar2.f = exc;
        if (exc instanceof WrongFileUploadException) {
            cvk.u(R.string.uploading_document_err_notify_wrong_file, false);
        } else if (exc instanceof EmptyFileUploadException) {
            cvk.u(R.string.uploading_document_err_notify, false);
        } else {
            abq0 abq0Var = new abq0(bVar.d);
            abq0Var.b = -1;
            abq0Var.c = null;
            Throwable cause = exc.getCause();
            if (cause instanceof VKApiExecutionException) {
                int s = ((VKApiExecutionException) cause).s();
                String message = cause.getMessage();
                abq0Var.b = s;
                abq0Var.c = message;
            } else if ((cause instanceof IOException) && TextUtils.equals("Canceled", cause.getMessage())) {
                abq0Var.c = cause.toString();
            }
            ysg0.b.a(abq0Var);
        }
        c(new b(bVar2));
    }

    public final void h(com.vk.upload.impl.b<?> bVar, NotificationCompat.h hVar) {
        Notification notification = hVar.I;
        int i = c.$EnumSwitchMapping$0[this.d.b.ordinal()];
        if (i == 1) {
            b(bVar, hVar, true);
            return;
        }
        if (i == 2) {
            b(bVar, hVar, false);
            return;
        }
        if (i == 3) {
            a aVar = com.vk.upload.impl.a.a.get(Integer.valueOf(bVar.d));
            if (aVar == null) {
                return;
            }
            String str = aVar.a;
            String str2 = aVar.b;
            a(hVar, str, str2, str2);
            notification.icon = R.drawable.vk_icon_done_outline_24;
            hVar.e(true);
            PendingIntent pendingIntent = aVar.c;
            if (pendingIntent != null) {
                hVar.g = pendingIntent;
                return;
            }
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        ozg0.a().getClass();
        Intent intent = new Intent(context, (Class<?>) LoadingBroadcastReceiver.class);
        intent.setAction("com.vkontakte.android.UPLOAD_RETRY");
        intent.putExtra("task_id", bVar.d);
        NotificationCompat.a b2 = new NotificationCompat.a.C0022a(R.drawable.vk_icon_refresh_outline_24, context2.getString(R.string.retry), PendingIntent.getBroadcast(context, 0, intent, 167772160)).b();
        a(hVar, context2.getString(R.string.upload_error), context2.getString(R.string.upload_error), context2.getString(R.string.default_network_error));
        notification.icon = android.R.drawable.stat_notify_error;
        hVar.n(16, true);
        hVar.n(2, false);
        hVar.b(b2);
    }

    public final void i(c.a aVar) {
        this.b = aVar;
    }

    public final void j(u6x.a aVar) {
        this.c = aVar;
    }

    /* compiled from: UploadNotification.kt */
    public static final class b {
        public final int a;
        public State b;
        public int c;
        public int d;
        public Parcelable e;
        public Throwable f;

        public b(int i, State state, int i2, int i3, Parcelable parcelable, Throwable th) {
            this.a = i;
            this.b = state;
            this.c = i2;
            this.d = i3;
            this.e = parcelable;
            this.f = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int a = shy.a(this.d, shy.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31);
            Parcelable parcelable = this.e;
            int hashCode = (a + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Throwable th = this.f;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadProgressEvent(jobId=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", loaded=");
            sb.append(this.c);
            sb.append(", total=");
            sb.append(this.d);
            sb.append(", resultObj=");
            sb.append(this.e);
            sb.append(", error=");
            return oq.c(sb, this.f, ')');
        }

        public b(b bVar) {
            this(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
        }
    }
}
