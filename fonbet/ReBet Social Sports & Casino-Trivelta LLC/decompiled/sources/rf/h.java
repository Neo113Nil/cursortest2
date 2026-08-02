package rf;

import E2.j;
import android.database.Cursor;
import androidx.room.AbstractC2268f;
import androidx.room.AbstractC2272j;
import androidx.room.k;
import androidx.room.w;
import androidx.room.x;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes4.dex */
public final class h implements InterfaceC6253a {

    /* renamed from: a, reason: collision with root package name */
    public final w f64214a;

    /* renamed from: b, reason: collision with root package name */
    public final k f64215b;

    /* renamed from: c, reason: collision with root package name */
    public final k f64216c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2272j f64217d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.G f64218e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.G f64219f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.room.G f64220g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.room.G f64221h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.room.G f64222i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.room.G f64223j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.room.G f64224k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.room.G f64225l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.room.G f64226m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.room.G f64227n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.room.G f64228o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.room.G f64229p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.room.G f64230q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.room.G f64231r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.room.G f64232s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.room.G f64233t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.room.G f64234u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.room.G f64235v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.room.G f64236w;

    public class A implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64237a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64238b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64239c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f64240d;

        public A(String str, String str2, String str3, String str4) {
            this.f64237a = str;
            this.f64238b = str2;
            this.f64239c = str3;
            this.f64240d = str4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64226m.acquire();
            acquire.P0(1, this.f64237a);
            acquire.P0(2, this.f64238b);
            acquire.P0(3, this.f64239c);
            acquire.P0(4, this.f64240d);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64226m.release(acquire);
            }
        }
    }

    public class B implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64242a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64243b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64244c;

        public B(String str, String str2, String str3) {
            this.f64242a = str;
            this.f64243b = str2;
            this.f64244c = str3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64227n.acquire();
            String str = this.f64242a;
            if (str == null) {
                acquire.C1(1);
            } else {
                acquire.P0(1, str);
            }
            acquire.P0(2, this.f64243b);
            acquire.P0(3, this.f64244c);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64227n.release(acquire);
            }
        }
    }

    public class C implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64246a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64247b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64248c;

        public C(String str, String str2, String str3) {
            this.f64246a = str;
            this.f64247b = str2;
            this.f64248c = str3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64228o.acquire();
            acquire.P0(1, this.f64246a);
            acquire.P0(2, this.f64247b);
            acquire.P0(3, this.f64248c);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64228o.release(acquire);
            }
        }
    }

    public class D implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Boolean f64250a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64251b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64252c;

        public D(Boolean bool, String str, String str2) {
            this.f64250a = bool;
            this.f64251b = str;
            this.f64252c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64229p.acquire();
            Boolean bool = this.f64250a;
            if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                acquire.C1(1);
            } else {
                acquire.h1(1, r1.intValue());
            }
            acquire.P0(2, this.f64251b);
            acquire.P0(3, this.f64252c);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64229p.release(acquire);
            }
        }
    }

    public class E implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64254a;

        public E(String str) {
            this.f64254a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = h.this.f64231r.acquire();
            acquire.P0(1, this.f64254a);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    acquire.G();
                    h.this.f64214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64231r.release(acquire);
            }
        }
    }

    public class F extends AbstractC2272j {
        public F(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE OR ABORT `messages` SET `acknowledgement_key` = ?,`conversation_id` = ?,`chat_id` = ?,`r_chat_id` = ?,`sequence_id` = ?,`message_type` = ?,`status` = ?,`message_id` = ?,`message_uid` = ?,`message` = ?,`formatted_message` = ?,`markdowns` = ?,`sender` = ?,`display_name` = ?,`attachment` = ?,`meta` = ?,`responded_message` = ?,`is_bot` = ?,`read_status` = ?,`is_typing` = ?,`is_edited` = ?,`is_deleted` = ?,`reply_to` = ?,`time_difference_content` = ?,`is_right_aligned` = ?,`extras` = ?,`server_time` = ?,`client_time` = ?,`previous_message_time` = ?,`edited_time` = ?,`deleted_time` = ?,`formatted_client_time` = ? WHERE `message_id` = ?";
        }

        @Override // androidx.room.AbstractC2272j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, MessageEntity messageEntity) {
            if (messageEntity.getAcknowledgementKey() == null) {
                kVar.C1(1);
            } else {
                kVar.P0(1, messageEntity.getAcknowledgementKey());
            }
            if (messageEntity.getConversationId() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, messageEntity.getConversationId());
            }
            kVar.P0(3, messageEntity.getChatId());
            if (messageEntity.getRChatId() == null) {
                kVar.C1(4);
            } else {
                kVar.P0(4, messageEntity.getRChatId());
            }
            if (messageEntity.getSequenceId() == null) {
                kVar.C1(5);
            } else {
                kVar.h1(5, messageEntity.getSequenceId().longValue());
            }
            if (messageEntity.getMessageType() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, messageEntity.getMessageType());
            }
            if (messageEntity.getStatus() == null) {
                kVar.C1(7);
            } else {
                kVar.h1(7, messageEntity.getStatus().intValue());
            }
            kVar.P0(8, messageEntity.getMessageId());
            kVar.P0(9, messageEntity.getMessageUID());
            if (messageEntity.getMessage() == null) {
                kVar.C1(10);
            } else {
                kVar.P0(10, messageEntity.getMessage());
            }
            if (messageEntity.getFormattedMessage() == null) {
                kVar.C1(11);
            } else {
                kVar.P0(11, messageEntity.getFormattedMessage());
            }
            if (messageEntity.getMarkdowns() == null) {
                kVar.C1(12);
            } else {
                kVar.P0(12, messageEntity.getMarkdowns());
            }
            if (messageEntity.getSender() == null) {
                kVar.C1(13);
            } else {
                kVar.P0(13, messageEntity.getSender());
            }
            if (messageEntity.getDisplayName() == null) {
                kVar.C1(14);
            } else {
                kVar.P0(14, messageEntity.getDisplayName());
            }
            if (messageEntity.getAttachment() == null) {
                kVar.C1(15);
            } else {
                kVar.P0(15, messageEntity.getAttachment());
            }
            if (messageEntity.getMeta() == null) {
                kVar.C1(16);
            } else {
                kVar.P0(16, messageEntity.getMeta());
            }
            if (messageEntity.getRespondedMessage() == null) {
                kVar.C1(17);
            } else {
                kVar.P0(17, messageEntity.getRespondedMessage());
            }
            kVar.h1(18, messageEntity.isBot() ? 1L : 0L);
            if ((messageEntity.getReadStatus() == null ? null : Integer.valueOf(messageEntity.getReadStatus().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(19);
            } else {
                kVar.h1(19, r0.intValue());
            }
            if ((messageEntity.isTyping() == null ? null : Integer.valueOf(messageEntity.isTyping().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(20);
            } else {
                kVar.h1(20, r0.intValue());
            }
            if ((messageEntity.isEdited() == null ? null : Integer.valueOf(messageEntity.isEdited().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(21);
            } else {
                kVar.h1(21, r0.intValue());
            }
            if ((messageEntity.isDeleted() != null ? Integer.valueOf(messageEntity.isDeleted().booleanValue() ? 1 : 0) : null) == null) {
                kVar.C1(22);
            } else {
                kVar.h1(22, r1.intValue());
            }
            if (messageEntity.getReplyTo() == null) {
                kVar.C1(23);
            } else {
                kVar.P0(23, messageEntity.getReplyTo());
            }
            if (messageEntity.getTimeDifferenceContent() == null) {
                kVar.C1(24);
            } else {
                kVar.P0(24, messageEntity.getTimeDifferenceContent());
            }
            kVar.h1(25, messageEntity.isRightAligned() ? 1L : 0L);
            if (messageEntity.getExtras() == null) {
                kVar.C1(26);
            } else {
                kVar.P0(26, messageEntity.getExtras());
            }
            MessageEntity.Time time = messageEntity.getTime();
            kVar.h1(27, time.getServerTime());
            kVar.h1(28, time.getClientTime());
            kVar.h1(29, time.getPreviousMessageTime());
            kVar.h1(30, time.getEditedTime());
            kVar.h1(31, time.getDeletedTime());
            if (time.getFormattedClientTime() == null) {
                kVar.C1(32);
            } else {
                kVar.P0(32, time.getFormattedClientTime());
            }
            kVar.P0(33, messageEntity.getMessageId());
        }
    }

    public class G implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64257a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64258b;

        public G(String str, String str2) {
            this.f64257a = str;
            this.f64258b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = h.this.f64232s.acquire();
            acquire.P0(1, this.f64257a);
            acquire.P0(2, this.f64258b);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    acquire.G();
                    h.this.f64214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64232s.release(acquire);
            }
        }
    }

    public class H implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64260a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64261b;

        public H(String str, String str2) {
            this.f64260a = str;
            this.f64261b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = h.this.f64234u.acquire();
            acquire.P0(1, this.f64260a);
            acquire.P0(2, this.f64261b);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    acquire.G();
                    h.this.f64214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64234u.release(acquire);
            }
        }
    }

    public class I implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64263a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64264b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64265c;

        public I(String str, String str2, String str3) {
            this.f64263a = str;
            this.f64264b = str2;
            this.f64265c = str3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = h.this.f64235v.acquire();
            acquire.P0(1, this.f64263a);
            acquire.P0(2, this.f64264b);
            acquire.P0(3, this.f64265c);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    acquire.G();
                    h.this.f64214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64235v.release(acquire);
            }
        }
    }

    public class J implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f64267a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f64268b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64269c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f64270d;

        public J(boolean z10, long j10, String str, String str2) {
            this.f64267a = z10;
            this.f64268b = j10;
            this.f64269c = str;
            this.f64270d = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            E2.k acquire = h.this.f64236w.acquire();
            acquire.h1(1, this.f64267a ? 1L : 0L);
            acquire.h1(2, this.f64268b);
            acquire.P0(3, this.f64269c);
            acquire.P0(4, this.f64270d);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    acquire.G();
                    h.this.f64214a.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64236w.release(acquire);
            }
        }
    }

    public class K implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64272a;

        public K(androidx.room.A a10) {
            this.f64272a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i10;
            int i11;
            String string;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64272a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                int e24 = A2.a.e(c10, "attachment");
                int e25 = A2.a.e(c10, "meta");
                int e26 = A2.a.e(c10, "responded_message");
                int e27 = A2.a.e(c10, "is_bot");
                int e28 = A2.a.e(c10, "read_status");
                int e29 = A2.a.e(c10, "is_typing");
                int e30 = A2.a.e(c10, "is_edited");
                int e31 = A2.a.e(c10, "is_deleted");
                int e32 = A2.a.e(c10, "reply_to");
                int e33 = A2.a.e(c10, "time_difference_content");
                int e34 = A2.a.e(c10, "is_right_aligned");
                int e35 = A2.a.e(c10, "extras");
                int e36 = A2.a.e(c10, "server_time");
                int e37 = A2.a.e(c10, "client_time");
                int e38 = A2.a.e(c10, "previous_message_time");
                int e39 = A2.a.e(c10, "edited_time");
                int e40 = A2.a.e(c10, "deleted_time");
                int e41 = A2.a.e(c10, "formatted_client_time");
                int i18 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.isNull(e10) ? null : c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    String string7 = c10.getString(e17);
                    String string8 = c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    String string12 = c10.isNull(e22) ? null : c10.getString(e22);
                    int i19 = i18;
                    if (c10.isNull(i19)) {
                        int i20 = e24;
                        i10 = e10;
                        i11 = i20;
                        string = null;
                    } else {
                        int i21 = e24;
                        i10 = e10;
                        i11 = i21;
                        string = c10.getString(i19);
                    }
                    if (c10.isNull(i11)) {
                        int i22 = e25;
                        i12 = i11;
                        i13 = i22;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i23 = e25;
                        i12 = i11;
                        i13 = i23;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i24 = e26;
                        i14 = i13;
                        i15 = i24;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i25 = e26;
                        i14 = i13;
                        i15 = i25;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i26 = e27;
                        i16 = i15;
                        i17 = i26;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i27 = e27;
                        i16 = i15;
                        i17 = i27;
                        str3 = string15;
                    }
                    boolean z10 = c10.getInt(i17) != 0;
                    int i28 = i17;
                    int i29 = e28;
                    Integer valueOf7 = c10.isNull(i29) ? null : Integer.valueOf(c10.getInt(i29));
                    if (valueOf7 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    e28 = i29;
                    int i30 = e29;
                    Integer valueOf8 = c10.isNull(i30) ? null : Integer.valueOf(c10.getInt(i30));
                    if (valueOf8 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                    }
                    e29 = i30;
                    int i31 = e30;
                    Integer valueOf9 = c10.isNull(i31) ? null : Integer.valueOf(c10.getInt(i31));
                    if (valueOf9 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                    }
                    e30 = i31;
                    int i32 = e31;
                    Integer valueOf10 = c10.isNull(i32) ? null : Integer.valueOf(c10.getInt(i32));
                    if (valueOf10 == null) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                    }
                    e31 = i32;
                    int i33 = e32;
                    String string16 = c10.isNull(i33) ? null : c10.getString(i33);
                    e32 = i33;
                    int i34 = e33;
                    String string17 = c10.isNull(i34) ? null : c10.getString(i34);
                    e33 = i34;
                    int i35 = e34;
                    boolean z11 = c10.getInt(i35) != 0;
                    e34 = i35;
                    int i36 = e35;
                    String string18 = c10.isNull(i36) ? null : c10.getString(i36);
                    e35 = i36;
                    int i37 = e36;
                    long j10 = c10.getLong(i37);
                    e36 = i37;
                    int i38 = e37;
                    long j11 = c10.getLong(i38);
                    e37 = i38;
                    int i39 = e38;
                    long j12 = c10.getLong(i39);
                    e38 = i39;
                    int i40 = e39;
                    long j13 = c10.getLong(i40);
                    e39 = i40;
                    int i41 = e40;
                    long j14 = c10.getLong(i41);
                    e40 = i41;
                    int i42 = e41;
                    e41 = i42;
                    arrayList.add(new MessageEntity(string2, string3, string4, string5, valueOf5, string6, valueOf6, string7, string8, string9, string10, string11, string12, string, str, str2, str3, z10, valueOf, valueOf2, valueOf3, valueOf4, string16, string17, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, c10.isNull(i42) ? null : c10.getString(i42))));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i28;
                    i18 = i19;
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        public void finalize() {
            this.f64272a.U();
        }
    }

    public class L implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64274a;

        public L(androidx.room.A a10) {
            this.f64274a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i10;
            int i11;
            String string;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64274a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                int e24 = A2.a.e(c10, "attachment");
                int e25 = A2.a.e(c10, "meta");
                int e26 = A2.a.e(c10, "responded_message");
                int e27 = A2.a.e(c10, "is_bot");
                int e28 = A2.a.e(c10, "read_status");
                int e29 = A2.a.e(c10, "is_typing");
                int e30 = A2.a.e(c10, "is_edited");
                int e31 = A2.a.e(c10, "is_deleted");
                int e32 = A2.a.e(c10, "reply_to");
                int e33 = A2.a.e(c10, "time_difference_content");
                int e34 = A2.a.e(c10, "is_right_aligned");
                int e35 = A2.a.e(c10, "extras");
                int e36 = A2.a.e(c10, "server_time");
                int e37 = A2.a.e(c10, "client_time");
                int e38 = A2.a.e(c10, "previous_message_time");
                int e39 = A2.a.e(c10, "edited_time");
                int e40 = A2.a.e(c10, "deleted_time");
                int e41 = A2.a.e(c10, "formatted_client_time");
                int i18 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.isNull(e10) ? null : c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    String string7 = c10.getString(e17);
                    String string8 = c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    String string12 = c10.isNull(e22) ? null : c10.getString(e22);
                    int i19 = i18;
                    if (c10.isNull(i19)) {
                        int i20 = e24;
                        i10 = e10;
                        i11 = i20;
                        string = null;
                    } else {
                        int i21 = e24;
                        i10 = e10;
                        i11 = i21;
                        string = c10.getString(i19);
                    }
                    if (c10.isNull(i11)) {
                        int i22 = e25;
                        i12 = i11;
                        i13 = i22;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i23 = e25;
                        i12 = i11;
                        i13 = i23;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i24 = e26;
                        i14 = i13;
                        i15 = i24;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i25 = e26;
                        i14 = i13;
                        i15 = i25;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i26 = e27;
                        i16 = i15;
                        i17 = i26;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i27 = e27;
                        i16 = i15;
                        i17 = i27;
                        str3 = string15;
                    }
                    boolean z10 = c10.getInt(i17) != 0;
                    int i28 = i17;
                    int i29 = e28;
                    Integer valueOf7 = c10.isNull(i29) ? null : Integer.valueOf(c10.getInt(i29));
                    if (valueOf7 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    e28 = i29;
                    int i30 = e29;
                    Integer valueOf8 = c10.isNull(i30) ? null : Integer.valueOf(c10.getInt(i30));
                    if (valueOf8 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                    }
                    e29 = i30;
                    int i31 = e30;
                    Integer valueOf9 = c10.isNull(i31) ? null : Integer.valueOf(c10.getInt(i31));
                    if (valueOf9 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                    }
                    e30 = i31;
                    int i32 = e31;
                    Integer valueOf10 = c10.isNull(i32) ? null : Integer.valueOf(c10.getInt(i32));
                    if (valueOf10 == null) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                    }
                    e31 = i32;
                    int i33 = e32;
                    String string16 = c10.isNull(i33) ? null : c10.getString(i33);
                    e32 = i33;
                    int i34 = e33;
                    String string17 = c10.isNull(i34) ? null : c10.getString(i34);
                    e33 = i34;
                    int i35 = e34;
                    boolean z11 = c10.getInt(i35) != 0;
                    e34 = i35;
                    int i36 = e35;
                    String string18 = c10.isNull(i36) ? null : c10.getString(i36);
                    e35 = i36;
                    int i37 = e36;
                    long j10 = c10.getLong(i37);
                    e36 = i37;
                    int i38 = e37;
                    long j11 = c10.getLong(i38);
                    e37 = i38;
                    int i39 = e38;
                    long j12 = c10.getLong(i39);
                    e38 = i39;
                    int i40 = e39;
                    long j13 = c10.getLong(i40);
                    e39 = i40;
                    int i41 = e40;
                    long j14 = c10.getLong(i41);
                    e40 = i41;
                    int i42 = e41;
                    e41 = i42;
                    arrayList.add(new MessageEntity(string2, string3, string4, string5, valueOf5, string6, valueOf6, string7, string8, string9, string10, string11, string12, string, str, str2, str3, z10, valueOf, valueOf2, valueOf3, valueOf4, string16, string17, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, c10.isNull(i42) ? null : c10.getString(i42))));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i28;
                    i18 = i19;
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        public void finalize() {
            this.f64274a.U();
        }
    }

    public class M implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64276a;

        public M(androidx.room.A a10) {
            this.f64276a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            M m10;
            int e10;
            int e11;
            int e12;
            int e13;
            int e14;
            int e15;
            int e16;
            int e17;
            int e18;
            int e19;
            int e20;
            int e21;
            int e22;
            int e23;
            int i10;
            int i11;
            String string;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64276a, false, null);
            try {
                e10 = A2.a.e(c10, "acknowledgement_key");
                e11 = A2.a.e(c10, "conversation_id");
                e12 = A2.a.e(c10, "chat_id");
                e13 = A2.a.e(c10, "r_chat_id");
                e14 = A2.a.e(c10, "sequence_id");
                e15 = A2.a.e(c10, "message_type");
                e16 = A2.a.e(c10, "status");
                e17 = A2.a.e(c10, "message_id");
                e18 = A2.a.e(c10, "message_uid");
                e19 = A2.a.e(c10, "message");
                e20 = A2.a.e(c10, "formatted_message");
                e21 = A2.a.e(c10, "markdowns");
                e22 = A2.a.e(c10, "sender");
                e23 = A2.a.e(c10, "display_name");
            } catch (Throwable th2) {
                th = th2;
                m10 = this;
            }
            try {
                int e24 = A2.a.e(c10, "attachment");
                int e25 = A2.a.e(c10, "meta");
                int e26 = A2.a.e(c10, "responded_message");
                int e27 = A2.a.e(c10, "is_bot");
                int e28 = A2.a.e(c10, "read_status");
                int e29 = A2.a.e(c10, "is_typing");
                int e30 = A2.a.e(c10, "is_edited");
                int e31 = A2.a.e(c10, "is_deleted");
                int e32 = A2.a.e(c10, "reply_to");
                int e33 = A2.a.e(c10, "time_difference_content");
                int e34 = A2.a.e(c10, "is_right_aligned");
                int e35 = A2.a.e(c10, "extras");
                int e36 = A2.a.e(c10, "server_time");
                int e37 = A2.a.e(c10, "client_time");
                int e38 = A2.a.e(c10, "previous_message_time");
                int e39 = A2.a.e(c10, "edited_time");
                int e40 = A2.a.e(c10, "deleted_time");
                int e41 = A2.a.e(c10, "formatted_client_time");
                int i18 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.isNull(e10) ? null : c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    String string7 = c10.getString(e17);
                    String string8 = c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    String string12 = c10.isNull(e22) ? null : c10.getString(e22);
                    int i19 = i18;
                    if (c10.isNull(i19)) {
                        int i20 = e24;
                        i10 = e10;
                        i11 = i20;
                        string = null;
                    } else {
                        int i21 = e24;
                        i10 = e10;
                        i11 = i21;
                        string = c10.getString(i19);
                    }
                    if (c10.isNull(i11)) {
                        int i22 = e25;
                        i12 = i11;
                        i13 = i22;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i23 = e25;
                        i12 = i11;
                        i13 = i23;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i24 = e26;
                        i14 = i13;
                        i15 = i24;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i25 = e26;
                        i14 = i13;
                        i15 = i25;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i26 = e27;
                        i16 = i15;
                        i17 = i26;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i27 = e27;
                        i16 = i15;
                        i17 = i27;
                        str3 = string15;
                    }
                    boolean z10 = c10.getInt(i17) != 0;
                    int i28 = i17;
                    int i29 = e28;
                    Integer valueOf7 = c10.isNull(i29) ? null : Integer.valueOf(c10.getInt(i29));
                    if (valueOf7 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    e28 = i29;
                    int i30 = e29;
                    Integer valueOf8 = c10.isNull(i30) ? null : Integer.valueOf(c10.getInt(i30));
                    if (valueOf8 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                    }
                    e29 = i30;
                    int i31 = e30;
                    Integer valueOf9 = c10.isNull(i31) ? null : Integer.valueOf(c10.getInt(i31));
                    if (valueOf9 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                    }
                    e30 = i31;
                    int i32 = e31;
                    Integer valueOf10 = c10.isNull(i32) ? null : Integer.valueOf(c10.getInt(i32));
                    if (valueOf10 == null) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                    }
                    e31 = i32;
                    int i33 = e32;
                    String string16 = c10.isNull(i33) ? null : c10.getString(i33);
                    e32 = i33;
                    int i34 = e33;
                    String string17 = c10.isNull(i34) ? null : c10.getString(i34);
                    e33 = i34;
                    int i35 = e34;
                    boolean z11 = c10.getInt(i35) != 0;
                    e34 = i35;
                    int i36 = e35;
                    String string18 = c10.isNull(i36) ? null : c10.getString(i36);
                    e35 = i36;
                    int i37 = e36;
                    long j10 = c10.getLong(i37);
                    e36 = i37;
                    int i38 = e37;
                    long j11 = c10.getLong(i38);
                    e37 = i38;
                    int i39 = e38;
                    long j12 = c10.getLong(i39);
                    e38 = i39;
                    int i40 = e39;
                    long j13 = c10.getLong(i40);
                    e39 = i40;
                    int i41 = e40;
                    long j14 = c10.getLong(i41);
                    e40 = i41;
                    int i42 = e41;
                    e41 = i42;
                    arrayList.add(new MessageEntity(string2, string3, string4, string5, valueOf5, string6, valueOf6, string7, string8, string9, string10, string11, string12, string, str, str2, str3, z10, valueOf, valueOf2, valueOf3, valueOf4, string16, string17, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, c10.isNull(i42) ? null : c10.getString(i42))));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i28;
                    i18 = i19;
                }
                c10.close();
                this.f64276a.U();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                m10 = this;
                c10.close();
                m10.f64276a.U();
                throw th;
            }
        }
    }

    public class N implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64278a;

        public N(androidx.room.A a10) {
            this.f64278a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            N n10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, n10.f64278a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z10 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z10, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64278a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    n10 = this;
                    c10.close();
                    n10.f64278a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class O extends androidx.room.G {
        public O(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET message_type = ? WHERE ? IS NOT NULL AND chat_id = ? AND message_id = ?";
        }
    }

    public class P implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64281a;

        public P(androidx.room.A a10) {
            this.f64281a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            P p10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, p10.f64281a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z10 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z10, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64281a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    p10 = this;
                    c10.close();
                    p10.f64281a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class Q implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64283a;

        public Q(androidx.room.A a10) {
            this.f64283a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Q q10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, q10.f64283a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z10 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z10, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64283a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    q10 = this;
                    c10.close();
                    q10.f64283a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class R implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64285a;

        public R(androidx.room.A a10) {
            this.f64285a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Long l10 = null;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64285a, false, null);
            try {
                if (c10.moveToFirst() && !c10.isNull(0)) {
                    l10 = Long.valueOf(c10.getLong(0));
                }
                return l10;
            } finally {
                c10.close();
                this.f64285a.U();
            }
        }
    }

    public class S implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64287a;

        public S(androidx.room.A a10) {
            this.f64287a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            S s10;
            int e10;
            int e11;
            int e12;
            int e13;
            int e14;
            int e15;
            int e16;
            int e17;
            int e18;
            int e19;
            int e20;
            int e21;
            int e22;
            int e23;
            int i10;
            int i11;
            String string;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64287a, false, null);
            try {
                e10 = A2.a.e(c10, "acknowledgement_key");
                e11 = A2.a.e(c10, "conversation_id");
                e12 = A2.a.e(c10, "chat_id");
                e13 = A2.a.e(c10, "r_chat_id");
                e14 = A2.a.e(c10, "sequence_id");
                e15 = A2.a.e(c10, "message_type");
                e16 = A2.a.e(c10, "status");
                e17 = A2.a.e(c10, "message_id");
                e18 = A2.a.e(c10, "message_uid");
                e19 = A2.a.e(c10, "message");
                e20 = A2.a.e(c10, "formatted_message");
                e21 = A2.a.e(c10, "markdowns");
                e22 = A2.a.e(c10, "sender");
                e23 = A2.a.e(c10, "display_name");
            } catch (Throwable th2) {
                th = th2;
                s10 = this;
            }
            try {
                int e24 = A2.a.e(c10, "attachment");
                int e25 = A2.a.e(c10, "meta");
                int e26 = A2.a.e(c10, "responded_message");
                int e27 = A2.a.e(c10, "is_bot");
                int e28 = A2.a.e(c10, "read_status");
                int e29 = A2.a.e(c10, "is_typing");
                int e30 = A2.a.e(c10, "is_edited");
                int e31 = A2.a.e(c10, "is_deleted");
                int e32 = A2.a.e(c10, "reply_to");
                int e33 = A2.a.e(c10, "time_difference_content");
                int e34 = A2.a.e(c10, "is_right_aligned");
                int e35 = A2.a.e(c10, "extras");
                int e36 = A2.a.e(c10, "server_time");
                int e37 = A2.a.e(c10, "client_time");
                int e38 = A2.a.e(c10, "previous_message_time");
                int e39 = A2.a.e(c10, "edited_time");
                int e40 = A2.a.e(c10, "deleted_time");
                int e41 = A2.a.e(c10, "formatted_client_time");
                int i18 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.isNull(e10) ? null : c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    String string7 = c10.getString(e17);
                    String string8 = c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    String string12 = c10.isNull(e22) ? null : c10.getString(e22);
                    int i19 = i18;
                    if (c10.isNull(i19)) {
                        int i20 = e24;
                        i10 = e10;
                        i11 = i20;
                        string = null;
                    } else {
                        int i21 = e24;
                        i10 = e10;
                        i11 = i21;
                        string = c10.getString(i19);
                    }
                    if (c10.isNull(i11)) {
                        int i22 = e25;
                        i12 = i11;
                        i13 = i22;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i23 = e25;
                        i12 = i11;
                        i13 = i23;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i24 = e26;
                        i14 = i13;
                        i15 = i24;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i25 = e26;
                        i14 = i13;
                        i15 = i25;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i26 = e27;
                        i16 = i15;
                        i17 = i26;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i27 = e27;
                        i16 = i15;
                        i17 = i27;
                        str3 = string15;
                    }
                    boolean z10 = c10.getInt(i17) != 0;
                    int i28 = i17;
                    int i29 = e28;
                    Integer valueOf7 = c10.isNull(i29) ? null : Integer.valueOf(c10.getInt(i29));
                    if (valueOf7 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    e28 = i29;
                    int i30 = e29;
                    Integer valueOf8 = c10.isNull(i30) ? null : Integer.valueOf(c10.getInt(i30));
                    if (valueOf8 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                    }
                    e29 = i30;
                    int i31 = e30;
                    Integer valueOf9 = c10.isNull(i31) ? null : Integer.valueOf(c10.getInt(i31));
                    if (valueOf9 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                    }
                    e30 = i31;
                    int i32 = e31;
                    Integer valueOf10 = c10.isNull(i32) ? null : Integer.valueOf(c10.getInt(i32));
                    if (valueOf10 == null) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                    }
                    e31 = i32;
                    int i33 = e32;
                    String string16 = c10.isNull(i33) ? null : c10.getString(i33);
                    e32 = i33;
                    int i34 = e33;
                    String string17 = c10.isNull(i34) ? null : c10.getString(i34);
                    e33 = i34;
                    int i35 = e34;
                    boolean z11 = c10.getInt(i35) != 0;
                    e34 = i35;
                    int i36 = e35;
                    String string18 = c10.isNull(i36) ? null : c10.getString(i36);
                    e35 = i36;
                    int i37 = e36;
                    long j10 = c10.getLong(i37);
                    e36 = i37;
                    int i38 = e37;
                    long j11 = c10.getLong(i38);
                    e37 = i38;
                    int i39 = e38;
                    long j12 = c10.getLong(i39);
                    e38 = i39;
                    int i40 = e39;
                    long j13 = c10.getLong(i40);
                    e39 = i40;
                    int i41 = e40;
                    long j14 = c10.getLong(i41);
                    e40 = i41;
                    int i42 = e41;
                    e41 = i42;
                    arrayList.add(new MessageEntity(string2, string3, string4, string5, valueOf5, string6, valueOf6, string7, string8, string9, string10, string11, string12, string, str, str2, str3, z10, valueOf, valueOf2, valueOf3, valueOf4, string16, string17, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, c10.isNull(i42) ? null : c10.getString(i42))));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i28;
                    i18 = i19;
                }
                c10.close();
                this.f64287a.U();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                s10 = this;
                c10.close();
                s10.f64287a.U();
                throw th;
            }
        }
    }

    public class T implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64289a;

        public T(androidx.room.A a10) {
            this.f64289a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            T t10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, t10.f64289a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z10 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z10, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64289a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    t10 = this;
                    c10.close();
                    t10.f64289a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class U implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64291a;

        public U(androidx.room.A a10) {
            this.f64291a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i10;
            int i11;
            String string;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64291a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                int e24 = A2.a.e(c10, "attachment");
                int e25 = A2.a.e(c10, "meta");
                int e26 = A2.a.e(c10, "responded_message");
                int e27 = A2.a.e(c10, "is_bot");
                int e28 = A2.a.e(c10, "read_status");
                int e29 = A2.a.e(c10, "is_typing");
                int e30 = A2.a.e(c10, "is_edited");
                int e31 = A2.a.e(c10, "is_deleted");
                int e32 = A2.a.e(c10, "reply_to");
                int e33 = A2.a.e(c10, "time_difference_content");
                int e34 = A2.a.e(c10, "is_right_aligned");
                int e35 = A2.a.e(c10, "extras");
                int e36 = A2.a.e(c10, "server_time");
                int e37 = A2.a.e(c10, "client_time");
                int e38 = A2.a.e(c10, "previous_message_time");
                int e39 = A2.a.e(c10, "edited_time");
                int e40 = A2.a.e(c10, "deleted_time");
                int e41 = A2.a.e(c10, "formatted_client_time");
                int i18 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.isNull(e10) ? null : c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    String string7 = c10.getString(e17);
                    String string8 = c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    String string12 = c10.isNull(e22) ? null : c10.getString(e22);
                    int i19 = i18;
                    if (c10.isNull(i19)) {
                        int i20 = e24;
                        i10 = e10;
                        i11 = i20;
                        string = null;
                    } else {
                        int i21 = e24;
                        i10 = e10;
                        i11 = i21;
                        string = c10.getString(i19);
                    }
                    if (c10.isNull(i11)) {
                        int i22 = e25;
                        i12 = i11;
                        i13 = i22;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i23 = e25;
                        i12 = i11;
                        i13 = i23;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i24 = e26;
                        i14 = i13;
                        i15 = i24;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i25 = e26;
                        i14 = i13;
                        i15 = i25;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i26 = e27;
                        i16 = i15;
                        i17 = i26;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i27 = e27;
                        i16 = i15;
                        i17 = i27;
                        str3 = string15;
                    }
                    boolean z10 = c10.getInt(i17) != 0;
                    int i28 = i17;
                    int i29 = e28;
                    Integer valueOf7 = c10.isNull(i29) ? null : Integer.valueOf(c10.getInt(i29));
                    if (valueOf7 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    e28 = i29;
                    int i30 = e29;
                    Integer valueOf8 = c10.isNull(i30) ? null : Integer.valueOf(c10.getInt(i30));
                    if (valueOf8 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                    }
                    e29 = i30;
                    int i31 = e30;
                    Integer valueOf9 = c10.isNull(i31) ? null : Integer.valueOf(c10.getInt(i31));
                    if (valueOf9 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                    }
                    e30 = i31;
                    int i32 = e31;
                    Integer valueOf10 = c10.isNull(i32) ? null : Integer.valueOf(c10.getInt(i32));
                    if (valueOf10 == null) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                    }
                    e31 = i32;
                    int i33 = e32;
                    String string16 = c10.isNull(i33) ? null : c10.getString(i33);
                    e32 = i33;
                    int i34 = e33;
                    String string17 = c10.isNull(i34) ? null : c10.getString(i34);
                    e33 = i34;
                    int i35 = e34;
                    boolean z11 = c10.getInt(i35) != 0;
                    e34 = i35;
                    int i36 = e35;
                    String string18 = c10.isNull(i36) ? null : c10.getString(i36);
                    e35 = i36;
                    int i37 = e36;
                    long j10 = c10.getLong(i37);
                    e36 = i37;
                    int i38 = e37;
                    long j11 = c10.getLong(i38);
                    e37 = i38;
                    int i39 = e38;
                    long j12 = c10.getLong(i39);
                    e38 = i39;
                    int i40 = e39;
                    long j13 = c10.getLong(i40);
                    e39 = i40;
                    int i41 = e40;
                    long j14 = c10.getLong(i41);
                    e40 = i41;
                    int i42 = e41;
                    e41 = i42;
                    arrayList.add(new MessageEntity(string2, string3, string4, string5, valueOf5, string6, valueOf6, string7, string8, string9, string10, string11, string12, string, str, str2, str3, z10, valueOf, valueOf2, valueOf3, valueOf4, string16, string17, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, c10.isNull(i42) ? null : c10.getString(i42))));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i28;
                    i18 = i19;
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        public void finalize() {
            this.f64291a.U();
        }
    }

    public class V implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64293a;

        public V(androidx.room.A a10) {
            this.f64293a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            V v10;
            int e10;
            int e11;
            int e12;
            int e13;
            int e14;
            int e15;
            int e16;
            int e17;
            int e18;
            int e19;
            int e20;
            int e21;
            int e22;
            int e23;
            int i10;
            int i11;
            String string;
            int i12;
            int i13;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            int i17;
            String str3;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64293a, false, null);
            try {
                e10 = A2.a.e(c10, "acknowledgement_key");
                e11 = A2.a.e(c10, "conversation_id");
                e12 = A2.a.e(c10, "chat_id");
                e13 = A2.a.e(c10, "r_chat_id");
                e14 = A2.a.e(c10, "sequence_id");
                e15 = A2.a.e(c10, "message_type");
                e16 = A2.a.e(c10, "status");
                e17 = A2.a.e(c10, "message_id");
                e18 = A2.a.e(c10, "message_uid");
                e19 = A2.a.e(c10, "message");
                e20 = A2.a.e(c10, "formatted_message");
                e21 = A2.a.e(c10, "markdowns");
                e22 = A2.a.e(c10, "sender");
                e23 = A2.a.e(c10, "display_name");
            } catch (Throwable th2) {
                th = th2;
                v10 = this;
            }
            try {
                int e24 = A2.a.e(c10, "attachment");
                int e25 = A2.a.e(c10, "meta");
                int e26 = A2.a.e(c10, "responded_message");
                int e27 = A2.a.e(c10, "is_bot");
                int e28 = A2.a.e(c10, "read_status");
                int e29 = A2.a.e(c10, "is_typing");
                int e30 = A2.a.e(c10, "is_edited");
                int e31 = A2.a.e(c10, "is_deleted");
                int e32 = A2.a.e(c10, "reply_to");
                int e33 = A2.a.e(c10, "time_difference_content");
                int e34 = A2.a.e(c10, "is_right_aligned");
                int e35 = A2.a.e(c10, "extras");
                int e36 = A2.a.e(c10, "server_time");
                int e37 = A2.a.e(c10, "client_time");
                int e38 = A2.a.e(c10, "previous_message_time");
                int e39 = A2.a.e(c10, "edited_time");
                int e40 = A2.a.e(c10, "deleted_time");
                int e41 = A2.a.e(c10, "formatted_client_time");
                int i18 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string2 = c10.isNull(e10) ? null : c10.getString(e10);
                    String string3 = c10.isNull(e11) ? null : c10.getString(e11);
                    String string4 = c10.getString(e12);
                    String string5 = c10.isNull(e13) ? null : c10.getString(e13);
                    Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                    String string6 = c10.isNull(e15) ? null : c10.getString(e15);
                    Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                    String string7 = c10.getString(e17);
                    String string8 = c10.getString(e18);
                    String string9 = c10.isNull(e19) ? null : c10.getString(e19);
                    String string10 = c10.isNull(e20) ? null : c10.getString(e20);
                    String string11 = c10.isNull(e21) ? null : c10.getString(e21);
                    String string12 = c10.isNull(e22) ? null : c10.getString(e22);
                    int i19 = i18;
                    if (c10.isNull(i19)) {
                        int i20 = e24;
                        i10 = e10;
                        i11 = i20;
                        string = null;
                    } else {
                        int i21 = e24;
                        i10 = e10;
                        i11 = i21;
                        string = c10.getString(i19);
                    }
                    if (c10.isNull(i11)) {
                        int i22 = e25;
                        i12 = i11;
                        i13 = i22;
                        str = null;
                    } else {
                        String string13 = c10.getString(i11);
                        int i23 = e25;
                        i12 = i11;
                        i13 = i23;
                        str = string13;
                    }
                    if (c10.isNull(i13)) {
                        int i24 = e26;
                        i14 = i13;
                        i15 = i24;
                        str2 = null;
                    } else {
                        String string14 = c10.getString(i13);
                        int i25 = e26;
                        i14 = i13;
                        i15 = i25;
                        str2 = string14;
                    }
                    if (c10.isNull(i15)) {
                        int i26 = e27;
                        i16 = i15;
                        i17 = i26;
                        str3 = null;
                    } else {
                        String string15 = c10.getString(i15);
                        int i27 = e27;
                        i16 = i15;
                        i17 = i27;
                        str3 = string15;
                    }
                    boolean z10 = c10.getInt(i17) != 0;
                    int i28 = i17;
                    int i29 = e28;
                    Integer valueOf7 = c10.isNull(i29) ? null : Integer.valueOf(c10.getInt(i29));
                    if (valueOf7 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                    }
                    e28 = i29;
                    int i30 = e29;
                    Integer valueOf8 = c10.isNull(i30) ? null : Integer.valueOf(c10.getInt(i30));
                    if (valueOf8 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                    }
                    e29 = i30;
                    int i31 = e30;
                    Integer valueOf9 = c10.isNull(i31) ? null : Integer.valueOf(c10.getInt(i31));
                    if (valueOf9 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                    }
                    e30 = i31;
                    int i32 = e31;
                    Integer valueOf10 = c10.isNull(i32) ? null : Integer.valueOf(c10.getInt(i32));
                    if (valueOf10 == null) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                    }
                    e31 = i32;
                    int i33 = e32;
                    String string16 = c10.isNull(i33) ? null : c10.getString(i33);
                    e32 = i33;
                    int i34 = e33;
                    String string17 = c10.isNull(i34) ? null : c10.getString(i34);
                    e33 = i34;
                    int i35 = e34;
                    boolean z11 = c10.getInt(i35) != 0;
                    e34 = i35;
                    int i36 = e35;
                    String string18 = c10.isNull(i36) ? null : c10.getString(i36);
                    e35 = i36;
                    int i37 = e36;
                    long j10 = c10.getLong(i37);
                    e36 = i37;
                    int i38 = e37;
                    long j11 = c10.getLong(i38);
                    e37 = i38;
                    int i39 = e38;
                    long j12 = c10.getLong(i39);
                    e38 = i39;
                    int i40 = e39;
                    long j13 = c10.getLong(i40);
                    e39 = i40;
                    int i41 = e40;
                    long j14 = c10.getLong(i41);
                    e40 = i41;
                    int i42 = e41;
                    e41 = i42;
                    arrayList.add(new MessageEntity(string2, string3, string4, string5, valueOf5, string6, valueOf6, string7, string8, string9, string10, string11, string12, string, str, str2, str3, z10, valueOf, valueOf2, valueOf3, valueOf4, string16, string17, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, c10.isNull(i42) ? null : c10.getString(i42))));
                    e10 = i10;
                    e24 = i12;
                    e25 = i14;
                    e26 = i16;
                    e27 = i28;
                    i18 = i19;
                }
                c10.close();
                this.f64293a.U();
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                v10 = this;
                c10.close();
                v10.f64293a.U();
                throw th;
            }
        }
    }

    public class W implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64295a;

        public W(androidx.room.A a10) {
            this.f64295a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            W w10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, w10.f64295a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z10 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z10, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64295a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    w10 = this;
                    c10.close();
                    w10.f64295a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class X implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64297a;

        public X(androidx.room.A a10) {
            this.f64297a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            X x10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, x10.f64297a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z10 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z10, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64297a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    x10 = this;
                    c10.close();
                    x10.f64297a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class Y extends androidx.room.G {
        public Y(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET status = ? WHERE ? IS NOT NULL AND chat_id = ? AND message_id = ?";
        }
    }

    public class Z implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64300a;

        public Z(androidx.room.A a10) {
            this.f64300a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            MessageEntity messageEntity;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Z z10 = this;
            Cursor c10 = A2.b.c(h.this.f64214a, z10.f64300a, false, null);
            try {
                int e10 = A2.a.e(c10, "acknowledgement_key");
                int e11 = A2.a.e(c10, "conversation_id");
                int e12 = A2.a.e(c10, "chat_id");
                int e13 = A2.a.e(c10, "r_chat_id");
                int e14 = A2.a.e(c10, "sequence_id");
                int e15 = A2.a.e(c10, "message_type");
                int e16 = A2.a.e(c10, "status");
                int e17 = A2.a.e(c10, "message_id");
                int e18 = A2.a.e(c10, "message_uid");
                int e19 = A2.a.e(c10, "message");
                int e20 = A2.a.e(c10, "formatted_message");
                int e21 = A2.a.e(c10, "markdowns");
                int e22 = A2.a.e(c10, "sender");
                int e23 = A2.a.e(c10, "display_name");
                try {
                    int e24 = A2.a.e(c10, "attachment");
                    int e25 = A2.a.e(c10, "meta");
                    int e26 = A2.a.e(c10, "responded_message");
                    int e27 = A2.a.e(c10, "is_bot");
                    int e28 = A2.a.e(c10, "read_status");
                    int e29 = A2.a.e(c10, "is_typing");
                    int e30 = A2.a.e(c10, "is_edited");
                    int e31 = A2.a.e(c10, "is_deleted");
                    int e32 = A2.a.e(c10, "reply_to");
                    int e33 = A2.a.e(c10, "time_difference_content");
                    int e34 = A2.a.e(c10, "is_right_aligned");
                    int e35 = A2.a.e(c10, "extras");
                    int e36 = A2.a.e(c10, "server_time");
                    int e37 = A2.a.e(c10, "client_time");
                    int e38 = A2.a.e(c10, "previous_message_time");
                    int e39 = A2.a.e(c10, "edited_time");
                    int e40 = A2.a.e(c10, "deleted_time");
                    int e41 = A2.a.e(c10, "formatted_client_time");
                    if (c10.moveToFirst()) {
                        String string = c10.isNull(e10) ? null : c10.getString(e10);
                        String string2 = c10.isNull(e11) ? null : c10.getString(e11);
                        String string3 = c10.getString(e12);
                        String string4 = c10.isNull(e13) ? null : c10.getString(e13);
                        Long valueOf5 = c10.isNull(e14) ? null : Long.valueOf(c10.getLong(e14));
                        String string5 = c10.isNull(e15) ? null : c10.getString(e15);
                        Integer valueOf6 = c10.isNull(e16) ? null : Integer.valueOf(c10.getInt(e16));
                        String string6 = c10.getString(e17);
                        String string7 = c10.getString(e18);
                        String string8 = c10.isNull(e19) ? null : c10.getString(e19);
                        String string9 = c10.isNull(e20) ? null : c10.getString(e20);
                        String string10 = c10.isNull(e21) ? null : c10.getString(e21);
                        String string11 = c10.isNull(e22) ? null : c10.getString(e22);
                        String string12 = c10.isNull(e23) ? null : c10.getString(e23);
                        String string13 = c10.isNull(e24) ? null : c10.getString(e24);
                        String string14 = c10.isNull(e25) ? null : c10.getString(e25);
                        String string15 = c10.isNull(e26) ? null : c10.getString(e26);
                        boolean z11 = c10.getInt(e27) != 0;
                        Integer valueOf7 = c10.isNull(e28) ? null : Integer.valueOf(c10.getInt(e28));
                        if (valueOf7 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
                        }
                        Integer valueOf8 = c10.isNull(e29) ? null : Integer.valueOf(c10.getInt(e29));
                        if (valueOf8 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
                        }
                        Integer valueOf9 = c10.isNull(e30) ? null : Integer.valueOf(c10.getInt(e30));
                        if (valueOf9 == null) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
                        }
                        Integer valueOf10 = c10.isNull(e31) ? null : Integer.valueOf(c10.getInt(e31));
                        if (valueOf10 == null) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
                        }
                        messageEntity = new MessageEntity(string, string2, string3, string4, valueOf5, string5, valueOf6, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, z11, valueOf, valueOf2, valueOf3, valueOf4, c10.isNull(e32) ? null : c10.getString(e32), c10.isNull(e33) ? null : c10.getString(e33), c10.getInt(e34) != 0, c10.isNull(e35) ? null : c10.getString(e35), new MessageEntity.Time(c10.getLong(e36), c10.getLong(e37), c10.getLong(e38), c10.getLong(e39), c10.getLong(e40), c10.isNull(e41) ? null : c10.getString(e41)));
                    } else {
                        messageEntity = null;
                    }
                    c10.close();
                    this.f64300a.U();
                    return messageEntity;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = this;
                    c10.close();
                    z10.f64300a.U();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: rf.h$a, reason: case insensitive filesystem */
    public class C6255a extends androidx.room.G {
        public C6255a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET chat_id = ? WHERE chat_id = ?";
        }
    }

    public class a0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64303a;

        public a0(androidx.room.A a10) {
            this.f64303a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64303a, false, null);
            try {
                int valueOf = c10.moveToFirst() ? Integer.valueOf(c10.getInt(0)) : 0;
                c10.close();
                this.f64303a.U();
                return valueOf;
            } catch (Throwable th2) {
                c10.close();
                this.f64303a.U();
                throw th2;
            }
        }
    }

    /* renamed from: rf.h$b, reason: case insensitive filesystem */
    public class C6256b extends androidx.room.G {
        public C6256b(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET r_chat_id = ? WHERE chat_id = ?";
        }
    }

    public class b0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64306a;

        public b0(androidx.room.A a10) {
            this.f64306a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64306a, false, null);
            try {
                int valueOf = c10.moveToFirst() ? Integer.valueOf(c10.getInt(0)) : 0;
                c10.close();
                this.f64306a.U();
                return valueOf;
            } catch (Throwable th2) {
                c10.close();
                this.f64306a.U();
                throw th2;
            }
        }
    }

    /* renamed from: rf.h$c, reason: case insensitive filesystem */
    public class C6257c extends androidx.room.G {
        public C6257c(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET conversation_id = ?, chat_id = ?, r_chat_id = ? WHERE acknowledgement_key = ?";
        }
    }

    public class c0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.room.A f64309a;

        public c0(androidx.room.A a10) {
            this.f64309a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Cursor c10 = A2.b.c(h.this.f64214a, this.f64309a, false, null);
            try {
                long valueOf = c10.moveToFirst() ? Long.valueOf(c10.getLong(0)) : 0L;
                c10.close();
                this.f64309a.U();
                return valueOf;
            } catch (Throwable th2) {
                c10.close();
                this.f64309a.U();
                throw th2;
            }
        }
    }

    /* renamed from: rf.h$d, reason: case insensitive filesystem */
    public class C6258d extends androidx.room.G {
        public C6258d(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET extras = ? WHERE chat_id = ? AND message_id = ?";
        }
    }

    public class d0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f64312a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f64313b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64314c;

        public d0(List list, int i10, String str) {
            this.f64312a = list;
            this.f64313b = i10;
            this.f64314c = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            StringBuilder b10 = A2.e.b();
            b10.append("UPDATE messages SET status = ");
            b10.append("?");
            b10.append(" WHERE ");
            b10.append("?");
            b10.append(" IS NOT NULL AND chat_id = ");
            b10.append("?");
            b10.append(" AND message_id in (");
            A2.e.a(b10, this.f64312a.size());
            b10.append(")");
            E2.k compileStatement = h.this.f64214a.compileStatement(b10.toString());
            compileStatement.h1(1, this.f64313b);
            compileStatement.P0(2, this.f64314c);
            compileStatement.P0(3, this.f64314c);
            Iterator it = this.f64312a.iterator();
            int i10 = 4;
            while (it.hasNext()) {
                compileStatement.P0(i10, (String) it.next());
                i10++;
            }
            h.this.f64214a.beginTransaction();
            try {
                Integer valueOf = Integer.valueOf(compileStatement.G());
                h.this.f64214a.setTransactionSuccessful();
                return valueOf;
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$e, reason: case insensitive filesystem */
    public class C6259e extends androidx.room.G {
        public C6259e(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET responded_message = ? WHERE chat_id = ? AND message_id = ?";
        }
    }

    public class e0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f64317a;

        public e0(j jVar) {
            this.f64317a = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            h.this.f64214a.beginTransaction();
            try {
                Cursor c10 = A2.b.c(h.this.f64214a, this.f64317a, false, null);
                try {
                    ArrayList arrayList = new ArrayList(c10.getCount());
                    while (c10.moveToNext()) {
                        arrayList.add(h.this.o0(c10));
                    }
                    h.this.f64214a.setTransactionSuccessful();
                    c10.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c10.close();
                    throw th2;
                }
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$f, reason: case insensitive filesystem */
    public class C6260f extends androidx.room.G {
        public C6260f(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET is_typing = ? WHERE chat_id = ? AND message_id = ?";
        }
    }

    public class f0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f64320a;

        public f0(j jVar) {
            this.f64320a = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEntity call() {
            h.this.f64214a.beginTransaction();
            try {
                Cursor c10 = A2.b.c(h.this.f64214a, this.f64320a, false, null);
                try {
                    MessageEntity o02 = c10.moveToFirst() ? h.this.o0(c10) : null;
                    h.this.f64214a.setTransactionSuccessful();
                    c10.close();
                    return o02;
                } catch (Throwable th2) {
                    c10.close();
                    throw th2;
                }
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$g, reason: case insensitive filesystem */
    public class C6261g extends androidx.room.G {
        public C6261g(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET meta = ? WHERE acknowledgement_key = ? AND message_id = ?";
        }
    }

    public class g0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f64323a;

        public g0(j jVar) {
            this.f64323a = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            h.this.f64214a.beginTransaction();
            try {
                Cursor c10 = A2.b.c(h.this.f64214a, this.f64323a, false, null);
                try {
                    int i10 = c10.moveToFirst() ? c10.getInt(0) : 0;
                    h.this.f64214a.setTransactionSuccessful();
                    Integer valueOf = Integer.valueOf(i10);
                    c10.close();
                    return valueOf;
                } catch (Throwable th2) {
                    c10.close();
                    throw th2;
                }
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$h, reason: collision with other inner class name */
    public class C0894h extends androidx.room.G {
        public C0894h(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM messages WHERE chat_id = ?";
        }
    }

    public class h0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f64326a;

        public h0(j jVar) {
            this.f64326a = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            h.this.f64214a.beginTransaction();
            try {
                Cursor c10 = A2.b.c(h.this.f64214a, this.f64326a, false, null);
                try {
                    int i10 = c10.moveToFirst() ? c10.getInt(0) : 0;
                    h.this.f64214a.setTransactionSuccessful();
                    Integer valueOf = Integer.valueOf(i10);
                    c10.close();
                    return valueOf;
                } catch (Throwable th2) {
                    c10.close();
                    throw th2;
                }
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$i, reason: case insensitive filesystem */
    public class C6262i extends androidx.room.G {
        public C6262i(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM messages WHERE chat_id = ? AND message_id = ?";
        }
    }

    public class i0 extends androidx.room.G {
        public i0(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET status = ? WHERE conversation_id = ? AND message_type = ?";
        }
    }

    /* renamed from: rf.h$j, reason: case insensitive filesystem */
    public class C6263j extends androidx.room.G {
        public C6263j(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM messages WHERE chat_id = ? AND client_time < ?";
        }
    }

    public class j0 implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f64331a;

        public j0(j jVar) {
            this.f64331a = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            h.this.f64214a.beginTransaction();
            try {
                Cursor c10 = A2.b.c(h.this.f64214a, this.f64331a, false, null);
                try {
                    int i10 = c10.moveToFirst() ? c10.getInt(0) : 0;
                    h.this.f64214a.setTransactionSuccessful();
                    Integer valueOf = Integer.valueOf(i10);
                    c10.close();
                    return valueOf;
                } catch (Throwable th2) {
                    c10.close();
                    throw th2;
                }
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$k, reason: case insensitive filesystem */
    public class C6264k extends k {
        public C6264k(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `messages` (`acknowledgement_key`,`conversation_id`,`chat_id`,`r_chat_id`,`sequence_id`,`message_type`,`status`,`message_id`,`message_uid`,`message`,`formatted_message`,`markdowns`,`sender`,`display_name`,`attachment`,`meta`,`responded_message`,`is_bot`,`read_status`,`is_typing`,`is_edited`,`is_deleted`,`reply_to`,`time_difference_content`,`is_right_aligned`,`extras`,`server_time`,`client_time`,`previous_message_time`,`edited_time`,`deleted_time`,`formatted_client_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, MessageEntity messageEntity) {
            if (messageEntity.getAcknowledgementKey() == null) {
                kVar.C1(1);
            } else {
                kVar.P0(1, messageEntity.getAcknowledgementKey());
            }
            if (messageEntity.getConversationId() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, messageEntity.getConversationId());
            }
            kVar.P0(3, messageEntity.getChatId());
            if (messageEntity.getRChatId() == null) {
                kVar.C1(4);
            } else {
                kVar.P0(4, messageEntity.getRChatId());
            }
            if (messageEntity.getSequenceId() == null) {
                kVar.C1(5);
            } else {
                kVar.h1(5, messageEntity.getSequenceId().longValue());
            }
            if (messageEntity.getMessageType() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, messageEntity.getMessageType());
            }
            if (messageEntity.getStatus() == null) {
                kVar.C1(7);
            } else {
                kVar.h1(7, messageEntity.getStatus().intValue());
            }
            kVar.P0(8, messageEntity.getMessageId());
            kVar.P0(9, messageEntity.getMessageUID());
            if (messageEntity.getMessage() == null) {
                kVar.C1(10);
            } else {
                kVar.P0(10, messageEntity.getMessage());
            }
            if (messageEntity.getFormattedMessage() == null) {
                kVar.C1(11);
            } else {
                kVar.P0(11, messageEntity.getFormattedMessage());
            }
            if (messageEntity.getMarkdowns() == null) {
                kVar.C1(12);
            } else {
                kVar.P0(12, messageEntity.getMarkdowns());
            }
            if (messageEntity.getSender() == null) {
                kVar.C1(13);
            } else {
                kVar.P0(13, messageEntity.getSender());
            }
            if (messageEntity.getDisplayName() == null) {
                kVar.C1(14);
            } else {
                kVar.P0(14, messageEntity.getDisplayName());
            }
            if (messageEntity.getAttachment() == null) {
                kVar.C1(15);
            } else {
                kVar.P0(15, messageEntity.getAttachment());
            }
            if (messageEntity.getMeta() == null) {
                kVar.C1(16);
            } else {
                kVar.P0(16, messageEntity.getMeta());
            }
            if (messageEntity.getRespondedMessage() == null) {
                kVar.C1(17);
            } else {
                kVar.P0(17, messageEntity.getRespondedMessage());
            }
            kVar.h1(18, messageEntity.isBot() ? 1L : 0L);
            if ((messageEntity.getReadStatus() == null ? null : Integer.valueOf(messageEntity.getReadStatus().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(19);
            } else {
                kVar.h1(19, r0.intValue());
            }
            if ((messageEntity.isTyping() == null ? null : Integer.valueOf(messageEntity.isTyping().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(20);
            } else {
                kVar.h1(20, r0.intValue());
            }
            if ((messageEntity.isEdited() == null ? null : Integer.valueOf(messageEntity.isEdited().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(21);
            } else {
                kVar.h1(21, r0.intValue());
            }
            if ((messageEntity.isDeleted() != null ? Integer.valueOf(messageEntity.isDeleted().booleanValue() ? 1 : 0) : null) == null) {
                kVar.C1(22);
            } else {
                kVar.h1(22, r1.intValue());
            }
            if (messageEntity.getReplyTo() == null) {
                kVar.C1(23);
            } else {
                kVar.P0(23, messageEntity.getReplyTo());
            }
            if (messageEntity.getTimeDifferenceContent() == null) {
                kVar.C1(24);
            } else {
                kVar.P0(24, messageEntity.getTimeDifferenceContent());
            }
            kVar.h1(25, messageEntity.isRightAligned() ? 1L : 0L);
            if (messageEntity.getExtras() == null) {
                kVar.C1(26);
            } else {
                kVar.P0(26, messageEntity.getExtras());
            }
            MessageEntity.Time time = messageEntity.getTime();
            kVar.h1(27, time.getServerTime());
            kVar.h1(28, time.getClientTime());
            kVar.h1(29, time.getPreviousMessageTime());
            kVar.h1(30, time.getEditedTime());
            kVar.h1(31, time.getDeletedTime());
            if (time.getFormattedClientTime() == null) {
                kVar.C1(32);
            } else {
                kVar.P0(32, time.getFormattedClientTime());
            }
        }
    }

    public class k0 extends androidx.room.G {
        public k0(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET status = ? WHERE acknowledgement_key = ? AND message_type = ?";
        }
    }

    /* renamed from: rf.h$l, reason: case insensitive filesystem */
    public class C6265l extends androidx.room.G {
        public C6265l(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM messages WHERE chat_id = ? AND message_type = ?";
        }
    }

    public class l0 extends androidx.room.G {
        public l0(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET read_status = ? WHERE ((? IS NOT NULL AND chat_id = ?) OR (? IS NOT NULL AND conversation_id = ?)) AND status = ? AND (message_uid = ? OR server_time <= ?)";
        }
    }

    /* renamed from: rf.h$m, reason: case insensitive filesystem */
    public class C6266m extends androidx.room.G {
        public C6266m(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET display_name = ? WHERE r_chat_id = ? AND sender = ?";
        }
    }

    public class m0 extends androidx.room.G {
        public m0(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET read_status = ? WHERE chat_id = ? AND status = ? AND server_time < ?";
        }
    }

    /* renamed from: rf.h$n, reason: case insensitive filesystem */
    public class C6267n extends androidx.room.G {
        public C6267n(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE messages SET is_deleted = ?, deleted_time = ?, message = '{}', formatted_message = null WHERE (chat_id = ? AND message_uid = ?)";
        }
    }

    /* renamed from: rf.h$o, reason: case insensitive filesystem */
    public class CallableC6268o implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MessageEntity f64340a;

        public CallableC6268o(MessageEntity messageEntity) {
            this.f64340a = messageEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            h.this.f64214a.beginTransaction();
            try {
                Long valueOf = Long.valueOf(h.this.f64215b.f(this.f64340a));
                h.this.f64214a.setTransactionSuccessful();
                return valueOf;
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$p, reason: case insensitive filesystem */
    public class CallableC6269p implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MessageEntity f64342a;

        public CallableC6269p(MessageEntity messageEntity) {
            this.f64342a = messageEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            h.this.f64214a.beginTransaction();
            try {
                Long valueOf = Long.valueOf(h.this.f64216c.f(this.f64342a));
                h.this.f64214a.setTransactionSuccessful();
                return valueOf;
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$q, reason: case insensitive filesystem */
    public class CallableC6270q implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MessageEntity f64344a;

        public CallableC6270q(MessageEntity messageEntity) {
            this.f64344a = messageEntity;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            h.this.f64214a.beginTransaction();
            try {
                int handle = h.this.f64217d.handle(this.f64344a);
                h.this.f64214a.setTransactionSuccessful();
                return Integer.valueOf(handle);
            } finally {
                h.this.f64214a.endTransaction();
            }
        }
    }

    /* renamed from: rf.h$r, reason: case insensitive filesystem */
    public class CallableC6271r implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64346a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64347b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64348c;

        public CallableC6271r(String str, String str2, String str3) {
            this.f64346a = str;
            this.f64347b = str2;
            this.f64348c = str3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64218e.acquire();
            acquire.P0(1, this.f64346a);
            acquire.P0(2, this.f64347b);
            acquire.P0(3, this.f64347b);
            String str = this.f64348c;
            if (str == null) {
                acquire.C1(4);
            } else {
                acquire.P0(4, str);
            }
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64218e.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$s, reason: case insensitive filesystem */
    public class CallableC6272s implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f64350a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64351b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64352c;

        public CallableC6272s(int i10, String str, String str2) {
            this.f64350a = i10;
            this.f64351b = str;
            this.f64352c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64219f.acquire();
            acquire.h1(1, this.f64350a);
            acquire.P0(2, this.f64351b);
            acquire.P0(3, this.f64351b);
            String str = this.f64352c;
            if (str == null) {
                acquire.C1(4);
            } else {
                acquire.P0(4, str);
            }
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64219f.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$t, reason: case insensitive filesystem */
    public class CallableC6273t implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f64354a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64355b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64356c;

        public CallableC6273t(int i10, String str, String str2) {
            this.f64354a = i10;
            this.f64355b = str;
            this.f64356c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64220g.acquire();
            acquire.h1(1, this.f64354a);
            acquire.P0(2, this.f64355b);
            acquire.P0(3, this.f64356c);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64220g.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$u, reason: case insensitive filesystem */
    public class CallableC6274u implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f64358a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64359b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64360c;

        public CallableC6274u(int i10, String str, String str2) {
            this.f64358a = i10;
            this.f64359b = str;
            this.f64360c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64221h.acquire();
            acquire.h1(1, this.f64358a);
            acquire.P0(2, this.f64359b);
            acquire.P0(3, this.f64360c);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64221h.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$v, reason: case insensitive filesystem */
    public class C6275v extends k {
        public C6275v(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR IGNORE INTO `messages` (`acknowledgement_key`,`conversation_id`,`chat_id`,`r_chat_id`,`sequence_id`,`message_type`,`status`,`message_id`,`message_uid`,`message`,`formatted_message`,`markdowns`,`sender`,`display_name`,`attachment`,`meta`,`responded_message`,`is_bot`,`read_status`,`is_typing`,`is_edited`,`is_deleted`,`reply_to`,`time_difference_content`,`is_right_aligned`,`extras`,`server_time`,`client_time`,`previous_message_time`,`edited_time`,`deleted_time`,`formatted_client_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, MessageEntity messageEntity) {
            if (messageEntity.getAcknowledgementKey() == null) {
                kVar.C1(1);
            } else {
                kVar.P0(1, messageEntity.getAcknowledgementKey());
            }
            if (messageEntity.getConversationId() == null) {
                kVar.C1(2);
            } else {
                kVar.P0(2, messageEntity.getConversationId());
            }
            kVar.P0(3, messageEntity.getChatId());
            if (messageEntity.getRChatId() == null) {
                kVar.C1(4);
            } else {
                kVar.P0(4, messageEntity.getRChatId());
            }
            if (messageEntity.getSequenceId() == null) {
                kVar.C1(5);
            } else {
                kVar.h1(5, messageEntity.getSequenceId().longValue());
            }
            if (messageEntity.getMessageType() == null) {
                kVar.C1(6);
            } else {
                kVar.P0(6, messageEntity.getMessageType());
            }
            if (messageEntity.getStatus() == null) {
                kVar.C1(7);
            } else {
                kVar.h1(7, messageEntity.getStatus().intValue());
            }
            kVar.P0(8, messageEntity.getMessageId());
            kVar.P0(9, messageEntity.getMessageUID());
            if (messageEntity.getMessage() == null) {
                kVar.C1(10);
            } else {
                kVar.P0(10, messageEntity.getMessage());
            }
            if (messageEntity.getFormattedMessage() == null) {
                kVar.C1(11);
            } else {
                kVar.P0(11, messageEntity.getFormattedMessage());
            }
            if (messageEntity.getMarkdowns() == null) {
                kVar.C1(12);
            } else {
                kVar.P0(12, messageEntity.getMarkdowns());
            }
            if (messageEntity.getSender() == null) {
                kVar.C1(13);
            } else {
                kVar.P0(13, messageEntity.getSender());
            }
            if (messageEntity.getDisplayName() == null) {
                kVar.C1(14);
            } else {
                kVar.P0(14, messageEntity.getDisplayName());
            }
            if (messageEntity.getAttachment() == null) {
                kVar.C1(15);
            } else {
                kVar.P0(15, messageEntity.getAttachment());
            }
            if (messageEntity.getMeta() == null) {
                kVar.C1(16);
            } else {
                kVar.P0(16, messageEntity.getMeta());
            }
            if (messageEntity.getRespondedMessage() == null) {
                kVar.C1(17);
            } else {
                kVar.P0(17, messageEntity.getRespondedMessage());
            }
            kVar.h1(18, messageEntity.isBot() ? 1L : 0L);
            if ((messageEntity.getReadStatus() == null ? null : Integer.valueOf(messageEntity.getReadStatus().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(19);
            } else {
                kVar.h1(19, r0.intValue());
            }
            if ((messageEntity.isTyping() == null ? null : Integer.valueOf(messageEntity.isTyping().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(20);
            } else {
                kVar.h1(20, r0.intValue());
            }
            if ((messageEntity.isEdited() == null ? null : Integer.valueOf(messageEntity.isEdited().booleanValue() ? 1 : 0)) == null) {
                kVar.C1(21);
            } else {
                kVar.h1(21, r0.intValue());
            }
            if ((messageEntity.isDeleted() != null ? Integer.valueOf(messageEntity.isDeleted().booleanValue() ? 1 : 0) : null) == null) {
                kVar.C1(22);
            } else {
                kVar.h1(22, r1.intValue());
            }
            if (messageEntity.getReplyTo() == null) {
                kVar.C1(23);
            } else {
                kVar.P0(23, messageEntity.getReplyTo());
            }
            if (messageEntity.getTimeDifferenceContent() == null) {
                kVar.C1(24);
            } else {
                kVar.P0(24, messageEntity.getTimeDifferenceContent());
            }
            kVar.h1(25, messageEntity.isRightAligned() ? 1L : 0L);
            if (messageEntity.getExtras() == null) {
                kVar.C1(26);
            } else {
                kVar.P0(26, messageEntity.getExtras());
            }
            MessageEntity.Time time = messageEntity.getTime();
            kVar.h1(27, time.getServerTime());
            kVar.h1(28, time.getClientTime());
            kVar.h1(29, time.getPreviousMessageTime());
            kVar.h1(30, time.getEditedTime());
            kVar.h1(31, time.getDeletedTime());
            if (time.getFormattedClientTime() == null) {
                kVar.C1(32);
            } else {
                kVar.P0(32, time.getFormattedClientTime());
            }
        }
    }

    /* renamed from: rf.h$w, reason: case insensitive filesystem */
    public class CallableC6276w implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f64363a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64364b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f64365c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f64366d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f64367e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f64368f;

        public CallableC6276w(boolean z10, String str, String str2, int i10, String str3, long j10) {
            this.f64363a = z10;
            this.f64364b = str;
            this.f64365c = str2;
            this.f64366d = i10;
            this.f64367e = str3;
            this.f64368f = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64222i.acquire();
            acquire.h1(1, this.f64363a ? 1L : 0L);
            String str = this.f64364b;
            if (str == null) {
                acquire.C1(2);
            } else {
                acquire.P0(2, str);
            }
            String str2 = this.f64364b;
            if (str2 == null) {
                acquire.C1(3);
            } else {
                acquire.P0(3, str2);
            }
            String str3 = this.f64365c;
            if (str3 == null) {
                acquire.C1(4);
            } else {
                acquire.P0(4, str3);
            }
            String str4 = this.f64365c;
            if (str4 == null) {
                acquire.C1(5);
            } else {
                acquire.P0(5, str4);
            }
            acquire.h1(6, this.f64366d);
            acquire.P0(7, this.f64367e);
            acquire.h1(8, this.f64368f);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64222i.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$x, reason: case insensitive filesystem */
    public class CallableC6277x implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f64370a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64371b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f64372c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f64373d;

        public CallableC6277x(boolean z10, String str, int i10, long j10) {
            this.f64370a = z10;
            this.f64371b = str;
            this.f64372c = i10;
            this.f64373d = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64223j.acquire();
            acquire.h1(1, this.f64370a ? 1L : 0L);
            acquire.P0(2, this.f64371b);
            acquire.h1(3, this.f64372c);
            acquire.h1(4, this.f64373d);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64223j.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$y, reason: case insensitive filesystem */
    public class CallableC6278y implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64375a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64376b;

        public CallableC6278y(String str, String str2) {
            this.f64375a = str;
            this.f64376b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64224k.acquire();
            acquire.P0(1, this.f64375a);
            acquire.P0(2, this.f64376b);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64224k.release(acquire);
            }
        }
    }

    /* renamed from: rf.h$z, reason: case insensitive filesystem */
    public class CallableC6279z implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f64378a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f64379b;

        public CallableC6279z(String str, String str2) {
            this.f64378a = str;
            this.f64379b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            E2.k acquire = h.this.f64225l.acquire();
            acquire.P0(1, this.f64378a);
            acquire.P0(2, this.f64379b);
            try {
                h.this.f64214a.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.G());
                    h.this.f64214a.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    h.this.f64214a.endTransaction();
                }
            } finally {
                h.this.f64225l.release(acquire);
            }
        }
    }

    public h(w wVar) {
        this.f64214a = wVar;
        this.f64215b = new C6264k(wVar);
        this.f64216c = new C6275v(wVar);
        this.f64217d = new F(wVar);
        this.f64218e = new O(wVar);
        this.f64219f = new Y(wVar);
        this.f64220g = new i0(wVar);
        this.f64221h = new k0(wVar);
        this.f64222i = new l0(wVar);
        this.f64223j = new m0(wVar);
        this.f64224k = new C6255a(wVar);
        this.f64225l = new C6256b(wVar);
        this.f64226m = new C6257c(wVar);
        this.f64227n = new C6258d(wVar);
        this.f64228o = new C6259e(wVar);
        this.f64229p = new C6260f(wVar);
        this.f64230q = new C6261g(wVar);
        this.f64231r = new C0894h(wVar);
        this.f64232s = new C6262i(wVar);
        this.f64233t = new C6263j(wVar);
        this.f64234u = new C6265l(wVar);
        this.f64235v = new C6266m(wVar);
        this.f64236w = new C6267n(wVar);
    }

    public static List L0() {
        return Collections.EMPTY_LIST;
    }

    @Override // rf.InterfaceC6253a
    public Object A(String str, long j10, boolean z10, int i10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6277x(z10, str, i10, j10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object B(final String str, final String str2, Continuation continuation) {
        return x.d(this.f64214a, new Function1() { // from class: rf.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object B10;
                B10 = super/*rf.a*/.B(str, str2, (Continuation) obj);
                return B10;
            }
        }, continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object E(String str, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ? IS NOT NULL AND acknowledgement_key = ? ORDER BY client_time DESC", 2);
        r10.P0(1, str);
        r10.P0(2, str);
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new S(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object F(j jVar, Continuation continuation) {
        return AbstractC2268f.b(this.f64214a, true, A2.b.a(), new g0(jVar), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object G(String str, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ? IS NOT NULL AND chat_id = ? ORDER BY client_time DESC LIMIT 1", 2);
        if (str == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str);
        }
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new W(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object H(String str, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new E(str), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object I(String str, String str2, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6278y(str2, str), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object J(j jVar, Continuation continuation) {
        return AbstractC2268f.b(this.f64214a, true, A2.b.a(), new f0(jVar), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object K(String str, String str2, String str3, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ((? IS NOT NULL AND chat_id = ?) OR (? IS NOT NULL AND acknowledgement_key = ?)) AND message_id = ?", 5);
        if (str2 == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str2);
        }
        if (str2 == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str2);
        }
        if (str == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str);
        }
        if (str == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str);
        }
        r10.P0(5, str3);
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new P(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object L(String str, String str2, String str3, String str4, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new A(str2, str3, str4, str), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object M(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ((? IS NOT NULL AND chat_id = ?) OR (? IS NOT NULL AND conversation_id = ?) OR (? IS NOT NULL AND r_chat_id = ?)) AND ((? IS NOT NULL AND message_uid = ?) OR (? IS NOT NULL AND message_id = ?))", 10);
        if (str2 == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str2);
        }
        if (str2 == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str2);
        }
        if (str == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str);
        }
        if (str == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str);
        }
        if (str3 == null) {
            r10.C1(5);
        } else {
            r10.P0(5, str3);
        }
        if (str3 == null) {
            r10.C1(6);
        } else {
            r10.P0(6, str3);
        }
        if (str4 == null) {
            r10.C1(7);
        } else {
            r10.P0(7, str4);
        }
        if (str4 == null) {
            r10.C1(8);
        } else {
            r10.P0(8, str4);
        }
        if (str5 == null) {
            r10.C1(9);
        } else {
            r10.P0(9, str5);
        }
        if (str5 == null) {
            r10.C1(10);
        } else {
            r10.P0(10, str5);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new N(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public InterfaceC5321f N(String str, String str2, String str3) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ((? IS NOT NULL AND chat_id = ?) OR (? IS NOT NULL AND acknowledgement_key = ?)) AND message_type = ? ORDER BY client_time ASC", 5);
        if (str2 == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str2);
        }
        if (str2 == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str2);
        }
        if (str == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str);
        }
        if (str == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str);
        }
        r10.P0(5, str3);
        return AbstractC2268f.a(this.f64214a, false, new String[]{"messages"}, new L(r10));
    }

    @Override // rf.InterfaceC6253a
    public Object O(String str, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ? IS NOT NULL AND chat_id = ? AND (is_typing IS NULL OR is_typing = 1) AND (sender LIKE 'LD%' OR sender LIKE 'b%' OR sender LIKE '^[0-9]+$') ORDER BY client_time DESC LIMIT 1", 2);
        if (str == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str);
        }
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new Z(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object P(String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ((? IS NOT NULL AND chat_id = ?) OR (? IS NOT NULL AND conversation_id = ?) OR (? IS NOT NULL AND r_chat_id = ?)) AND ((? IS NOT NULL AND message_uid = ?) OR (? IS NOT NULL AND message_id = ?)) AND (status = 0)", 10);
        if (str2 == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str2);
        }
        if (str2 == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str2);
        }
        if (str == null) {
            r10.C1(3);
        } else {
            r10.P0(3, str);
        }
        if (str == null) {
            r10.C1(4);
        } else {
            r10.P0(4, str);
        }
        if (str3 == null) {
            r10.C1(5);
        } else {
            r10.P0(5, str3);
        }
        if (str3 == null) {
            r10.C1(6);
        } else {
            r10.P0(6, str3);
        }
        if (str4 == null) {
            r10.C1(7);
        } else {
            r10.P0(7, str4);
        }
        if (str4 == null) {
            r10.C1(8);
        } else {
            r10.P0(8, str4);
        }
        if (str5 == null) {
            r10.C1(9);
        } else {
            r10.P0(9, str5);
        }
        if (str5 == null) {
            r10.C1(10);
        } else {
            r10.P0(10, str5);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new Q(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object Q(final String str, final List list, final Function2 function2, Continuation continuation) {
        return x.d(this.f64214a, new Function1() { // from class: rf.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object Q10;
                Q10 = super/*rf.a*/.Q(str, list, function2, (Continuation) obj);
                return Q10;
            }
        }, continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object S(MessageEntity messageEntity, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6269p(messageEntity), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object U(j jVar, Continuation continuation) {
        return AbstractC2268f.b(this.f64214a, true, A2.b.a(), new e0(jVar), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object W(List list, Continuation continuation) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT * FROM messages WHERE message_id in (");
        int size = list.size();
        A2.e.a(b10, size);
        b10.append(") ORDER BY client_time ASC");
        androidx.room.A r10 = androidx.room.A.r(b10.toString(), size);
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            r10.P0(i10, (String) it.next());
            i10++;
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new M(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object Y(String str, String str2, String str3, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new B(str3, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object Z(String str, String str2, String str3, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new C(str3, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public InterfaceC5321f a(String str, String str2) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE (chat_id = ? OR acknowledgement_key = ?) AND (is_typing IS NULL OR is_typing = 1) ORDER BY client_time DESC", 2);
        r10.P0(1, str2);
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        return AbstractC2268f.a(this.f64214a, false, new String[]{"messages"}, new K(r10));
    }

    @Override // rf.InterfaceC6253a
    public Object a0(MessageEntity messageEntity, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6268o(messageEntity), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object b(String str, String str2, Boolean bool, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new D(bool, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object b0(final List list, Continuation continuation) {
        return x.d(this.f64214a, new Function1() { // from class: rf.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object b02;
                b02 = super/*rf.a*/.b0(list, (Continuation) obj);
                return b02;
            }
        }, continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object c(Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE client_time IN (SELECT MAX(client_time) FROM messages GROUP BY chat_id)", 0);
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new V(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object c0(String str, String str2, boolean z10, long j10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new J(z10, j10, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object d(j jVar, Continuation continuation) {
        return AbstractC2268f.b(this.f64214a, true, A2.b.a(), new h0(jVar), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object e(String str, String str2, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT COUNT(*) FROM messages WHERE (chat_id = ? OR acknowledgement_key = ?) AND is_typing IS NOT NULL", 2);
        if (str2 == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str2);
        }
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new c0(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object f0(String str, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT server_time FROM messages WHERE (? IS NOT NULL AND chat_id = ?) ORDER BY server_time DESC LIMIT 1", 2);
        r10.P0(1, str);
        r10.P0(2, str);
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new R(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object g0(final Pair pair, final Pair pair2, Continuation continuation) {
        return x.d(this.f64214a, new Function1() { // from class: rf.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object g02;
                g02 = super/*rf.a*/.g0(pair, pair2, (Continuation) obj);
                return g02;
            }
        }, continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object h(String str, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ? IS NOT NULL AND acknowledgement_key = ? AND (is_typing IS NULL OR is_typing = 1) AND (sender LIKE 'LD%' OR sender LIKE 'b%' OR sender LIKE '^[0-9]+$') ORDER BY client_time DESC LIMIT 1", 2);
        if (str == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str);
        }
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new X(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object h0(String str, List list, int i10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new d0(list, i10, str), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object i(String str, String str2, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new H(str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object j(String str, String str2, String str3, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new I(str3, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object k(String str, String str2, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new G(str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object l(String str, String str2, int i10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6272s(i10, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object m(j jVar, Continuation continuation) {
        return AbstractC2268f.b(this.f64214a, true, A2.b.a(), new j0(jVar), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object n(MessageEntity messageEntity, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6270q(messageEntity), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object o(String str, String str2, String str3, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6271r(str3, str, str2), continuation);
    }

    public final MessageEntity o0(Cursor cursor) {
        String string;
        int i10;
        String string2;
        int i11;
        String string3;
        int i12;
        boolean z10;
        Boolean valueOf;
        Boolean bool;
        Boolean valueOf2;
        Boolean bool2;
        Boolean valueOf3;
        Boolean bool3;
        Boolean valueOf4;
        Boolean bool4;
        String string4;
        int i13;
        String string5;
        int i14;
        boolean z11;
        int d10 = A2.a.d(cursor, "acknowledgement_key");
        int d11 = A2.a.d(cursor, "conversation_id");
        int d12 = A2.a.d(cursor, "chat_id");
        int d13 = A2.a.d(cursor, "r_chat_id");
        int d14 = A2.a.d(cursor, "sequence_id");
        int d15 = A2.a.d(cursor, "message_type");
        int d16 = A2.a.d(cursor, "status");
        int d17 = A2.a.d(cursor, "message_id");
        int d18 = A2.a.d(cursor, "message_uid");
        int d19 = A2.a.d(cursor, "message");
        int d20 = A2.a.d(cursor, "formatted_message");
        int d21 = A2.a.d(cursor, "markdowns");
        int d22 = A2.a.d(cursor, "sender");
        int d23 = A2.a.d(cursor, "display_name");
        int d24 = A2.a.d(cursor, "attachment");
        int d25 = A2.a.d(cursor, "meta");
        int d26 = A2.a.d(cursor, "responded_message");
        int d27 = A2.a.d(cursor, "is_bot");
        int d28 = A2.a.d(cursor, "read_status");
        int d29 = A2.a.d(cursor, "is_typing");
        int d30 = A2.a.d(cursor, "is_edited");
        int d31 = A2.a.d(cursor, "is_deleted");
        int d32 = A2.a.d(cursor, "reply_to");
        int d33 = A2.a.d(cursor, "time_difference_content");
        int d34 = A2.a.d(cursor, "is_right_aligned");
        int d35 = A2.a.d(cursor, "extras");
        int d36 = A2.a.d(cursor, "server_time");
        int d37 = A2.a.d(cursor, "client_time");
        int d38 = A2.a.d(cursor, "previous_message_time");
        int d39 = A2.a.d(cursor, "edited_time");
        int d40 = A2.a.d(cursor, "deleted_time");
        int d41 = A2.a.d(cursor, "formatted_client_time");
        String str = null;
        String string6 = (d10 == -1 || cursor.isNull(d10)) ? null : cursor.getString(d10);
        String string7 = (d11 == -1 || cursor.isNull(d11)) ? null : cursor.getString(d11);
        String string8 = d12 == -1 ? null : cursor.getString(d12);
        String string9 = (d13 == -1 || cursor.isNull(d13)) ? null : cursor.getString(d13);
        Long valueOf5 = (d14 == -1 || cursor.isNull(d14)) ? null : Long.valueOf(cursor.getLong(d14));
        String string10 = (d15 == -1 || cursor.isNull(d15)) ? null : cursor.getString(d15);
        Integer valueOf6 = (d16 == -1 || cursor.isNull(d16)) ? null : Integer.valueOf(cursor.getInt(d16));
        String string11 = d17 == -1 ? null : cursor.getString(d17);
        String string12 = d18 == -1 ? null : cursor.getString(d18);
        String string13 = (d19 == -1 || cursor.isNull(d19)) ? null : cursor.getString(d19);
        String string14 = (d20 == -1 || cursor.isNull(d20)) ? null : cursor.getString(d20);
        String string15 = (d21 == -1 || cursor.isNull(d21)) ? null : cursor.getString(d21);
        String string16 = (d22 == -1 || cursor.isNull(d22)) ? null : cursor.getString(d22);
        if (d23 == -1 || cursor.isNull(d23)) {
            i10 = d24;
            string = null;
        } else {
            string = cursor.getString(d23);
            i10 = d24;
        }
        if (i10 == -1 || cursor.isNull(i10)) {
            i11 = d25;
            string2 = null;
        } else {
            string2 = cursor.getString(i10);
            i11 = d25;
        }
        if (i11 == -1 || cursor.isNull(i11)) {
            i12 = d26;
            string3 = null;
        } else {
            string3 = cursor.getString(i11);
            i12 = d26;
        }
        String string17 = (i12 == -1 || cursor.isNull(i12)) ? null : cursor.getString(i12);
        if (d27 == -1) {
            z10 = false;
        } else {
            z10 = cursor.getInt(d27) != 0;
        }
        if (d28 == -1) {
            bool = null;
        } else {
            Integer valueOf7 = cursor.isNull(d28) ? null : Integer.valueOf(cursor.getInt(d28));
            if (valueOf7 == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(valueOf7.intValue() != 0);
            }
            bool = valueOf;
        }
        if (d29 == -1) {
            bool2 = null;
        } else {
            Integer valueOf8 = cursor.isNull(d29) ? null : Integer.valueOf(cursor.getInt(d29));
            if (valueOf8 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(valueOf8.intValue() != 0);
            }
            bool2 = valueOf2;
        }
        if (d30 == -1) {
            bool3 = null;
        } else {
            Integer valueOf9 = cursor.isNull(d30) ? null : Integer.valueOf(cursor.getInt(d30));
            if (valueOf9 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(valueOf9.intValue() != 0);
            }
            bool3 = valueOf3;
        }
        if (d31 == -1) {
            bool4 = null;
        } else {
            Integer valueOf10 = cursor.isNull(d31) ? null : Integer.valueOf(cursor.getInt(d31));
            if (valueOf10 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(valueOf10.intValue() != 0);
            }
            bool4 = valueOf4;
        }
        if (d32 == -1 || cursor.isNull(d32)) {
            i13 = d33;
            string4 = null;
        } else {
            string4 = cursor.getString(d32);
            i13 = d33;
        }
        if (i13 == -1 || cursor.isNull(i13)) {
            i14 = d34;
            string5 = null;
        } else {
            string5 = cursor.getString(i13);
            i14 = d34;
        }
        if (i14 == -1) {
            z11 = false;
        } else {
            z11 = cursor.getInt(i14) != 0;
        }
        String string18 = (d35 == -1 || cursor.isNull(d35)) ? null : cursor.getString(d35);
        long j10 = d36 == -1 ? 0L : cursor.getLong(d36);
        long j11 = d37 == -1 ? 0L : cursor.getLong(d37);
        long j12 = d38 == -1 ? 0L : cursor.getLong(d38);
        long j13 = d39 == -1 ? 0L : cursor.getLong(d39);
        long j14 = d40 != -1 ? cursor.getLong(d40) : 0L;
        if (d41 != -1 && !cursor.isNull(d41)) {
            str = cursor.getString(d41);
        }
        return new MessageEntity(string6, string7, string8, string9, valueOf5, string10, valueOf6, string11, string12, string13, string14, string15, string16, string, string2, string3, string17, z10, bool, bool2, bool3, bool4, string4, string5, z11, string18, new MessageEntity.Time(j10, j11, j12, j13, j14, str));
    }

    @Override // rf.InterfaceC6253a
    public Object p(String str, String str2, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT COUNT(*) FROM MESSAGES WHERE chat_id = ? AND message_type = ?", 2);
        r10.P0(1, str);
        r10.P0(2, str2);
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new a0(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object r(String str, String str2, int i10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6274u(i10, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object s(String str, String str2, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6279z(str2, str), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object t(String str, String str2, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT COUNT(*) FROM MESSAGES WHERE chat_id = ? AND message_id = ?", 2);
        r10.P0(1, str);
        r10.P0(2, str2);
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new b0(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object u(String str, String str2, int i10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6273t(i10, str, str2), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object v(String str, Continuation continuation) {
        androidx.room.A r10 = androidx.room.A.r("SELECT * FROM messages WHERE ? IS NOT NULL AND acknowledgement_key = ? ORDER BY client_time DESC LIMIT 1", 2);
        if (str == null) {
            r10.C1(1);
        } else {
            r10.P0(1, str);
        }
        if (str == null) {
            r10.C1(2);
        } else {
            r10.P0(2, str);
        }
        return AbstractC2268f.b(this.f64214a, false, A2.b.a(), new T(r10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object w(final String str, final List list, final List list2, final Function2 function2, Continuation continuation) {
        return x.d(this.f64214a, new Function1() { // from class: rf.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object w10;
                w10 = super/*rf.a*/.w(str, list, list2, function2, (Continuation) obj);
                return w10;
            }
        }, continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object x(final String str, final List list, Continuation continuation) {
        return x.d(this.f64214a, new Function1() { // from class: rf.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object x10;
                x10 = super/*rf.a*/.x(str, list, (Continuation) obj);
                return x10;
            }
        }, continuation);
    }

    @Override // rf.InterfaceC6253a
    public Object y(String str, String str2, String str3, long j10, boolean z10, int i10, Continuation continuation) {
        return AbstractC2268f.c(this.f64214a, true, new CallableC6276w(z10, str, str2, i10, str3, j10), continuation);
    }

    @Override // rf.InterfaceC6253a
    public InterfaceC5321f z() {
        return AbstractC2268f.a(this.f64214a, false, new String[]{"messages"}, new U(androidx.room.A.r("SELECT * FROM messages WHERE client_time IN (SELECT MAX(client_time) FROM messages WHERE is_typing IS NULL GROUP BY chat_id)", 0)));
    }
}
