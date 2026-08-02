package com.vk.im.engine.models.messages;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.cim0;
import xsna.cor;
import xsna.d8k;
import xsna.e0s;
import xsna.eni0;
import xsna.fvq0;
import xsna.fyo0;
import xsna.g5g;
import xsna.gsq0;
import xsna.hfr;
import xsna.i5g;
import xsna.izs;
import xsna.j5g;
import xsna.l6u;
import xsna.lwp0;
import xsna.myc0;
import xsna.pq8;
import xsna.rli0;
import xsna.s3q0;
import xsna.t3w0;
import xsna.tml0;
import xsna.uki0;
import xsna.uww0;
import xsna.v040;
import xsna.vsx0;
import xsna.weq0;
import xsna.xvl0;

/* compiled from: WithUserContent.kt */
/* loaded from: classes2.dex */
public interface a extends vsx0, t3w0 {

    /* compiled from: WithUserContent.kt */
    /* renamed from: com.vk.im.engine.models.messages.a$a, reason: collision with other inner class name */
    public static final class C1125a {
        public static final Attach a(a aVar, Class cls) {
            List<Attach> K0 = aVar.K0();
            int size = K0.size();
            for (int i = 0; i < size; i++) {
                Attach attach = K0.get(i);
                if (attach.getClass().equals(cls) || cls.isAssignableFrom(attach.getClass())) {
                    return attach;
                }
            }
            return null;
        }

        public static void b(a aVar, ArrayList arrayList) {
            if (!aVar.K0().isEmpty()) {
                hfr.a aVar2 = new hfr.a(rli0.k(new i5g(aVar.K0()), AttachWall.class));
                while (aVar2.hasNext()) {
                    arrayList.addAll(((AttachWall) aVar2.next()).o);
                }
                arrayList.addAll(aVar.K0());
            }
            List<NestedMsg> q7 = aVar.q7();
            int size = q7.size();
            for (int i = 0; i < size; i++) {
                b(q7.get(i), arrayList);
            }
        }

        public static Attach c(NestedMsg nestedMsg, Class cls, boolean z) {
            Object obj;
            ArrayList arrayList = nestedMsg.j;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    obj = arrayList.get(i);
                    if (((Attach) obj).getClass().isAssignableFrom(cls)) {
                        break;
                    }
                }
            }
            obj = null;
            Attach attach = (Attach) obj;
            if (attach != null) {
                return attach;
            }
            if (z) {
                ArrayList arrayList2 = nestedMsg.k;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Attach c = c((NestedMsg) arrayList2.get(i2), cls, z);
                    if (c != null) {
                        return c;
                    }
                }
            }
            return null;
        }

        public static ArrayList d(List list) {
            ArrayList arrayList = new ArrayList();
            List list2 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (!(((Attach) obj) instanceof AttachWall)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            ArrayList E = g5g.E(list2, AttachWall.class);
            ArrayList arrayList3 = new ArrayList(c5g.u(E, 10));
            Iterator it = E.iterator();
            while (it.hasNext()) {
                arrayList3.add(d(((AttachWall) it.next()).o));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.addAll((Collection) it2.next());
            }
            return arrayList;
        }

        public static void e(a aVar, Class cls, boolean z, ArrayList arrayList, boolean z2) {
            uki0 x;
            if (aVar.g8()) {
                if (z2) {
                    x = new i5g(d(aVar.K0()));
                } else {
                    cor o = rli0.o(rli0.k(new i5g(aVar.K0()), AttachWall.class), new lwp0(12));
                    x = rli0.x(rli0.x(o, new i5g(aVar.K0())), rli0.o(rli0.k(new i5g(aVar.K0()), AttachChannelMessage.class), new fyo0(11)));
                }
                hfr.a aVar2 = new hfr.a(rli0.j(x, new gsq0(cls, 14)));
                while (aVar2.hasNext()) {
                    arrayList.add((Attach) aVar2.next());
                }
            }
            if (z) {
                List<NestedMsg> q7 = aVar.q7();
                int size = q7.size();
                for (int i = 0; i < size; i++) {
                    e(q7.get(i), cls, z, arrayList, z2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void f(a aVar, izs izsVar, izs izsVar2) {
            ListIterator<Attach> listIterator = aVar.K0().listIterator();
            while (listIterator.hasNext()) {
                Attach attach = (Attach) listIterator.next();
                if (((Boolean) izsVar.invoke(attach)).booleanValue()) {
                    listIterator.set(izsVar2.invoke(attach));
                } else if (attach instanceof AttachWall) {
                    ListIterator<Attach> listIterator2 = ((AttachWall) attach).o.listIterator();
                    while (listIterator2.hasNext()) {
                        Attach attach2 = (Attach) listIterator2.next();
                        if (((Boolean) izsVar.invoke(attach2)).booleanValue()) {
                            listIterator2.set(izsVar2.invoke(attach2));
                        }
                    }
                }
            }
            List<NestedMsg> q7 = aVar.q7();
            int size = q7.size();
            for (int i = 0; i < size; i++) {
                f(q7.get(i), izsVar, izsVar2);
            }
        }
    }

    static Attach Q7(a aVar, izs izsVar, boolean z) {
        Attach attach;
        List<Attach> K0 = aVar.K0();
        if (!K0.isEmpty()) {
            int size = K0.size();
            for (int i = 0; i < size; i++) {
                attach = K0.get(i);
                if (((Boolean) izsVar.invoke(attach)).booleanValue()) {
                    break;
                }
            }
        }
        attach = null;
        Attach attach2 = attach;
        if (attach2 != null || !z) {
            return attach2;
        }
        Iterator<T> it = aVar.q7().iterator();
        while (it.hasNext()) {
            Attach Q7 = Q7((a) it.next(), izsVar, z);
            if (Q7 != null) {
                return Q7;
            }
        }
        return null;
    }

    default boolean A4(boolean z) {
        return D3(AttachWall.class, z);
    }

    void Ba(MsgTextFormat msgTextFormat);

    long C();

    default BotButton Ca(pq8 pq8Var) {
        BotKeyboard V2;
        BotKeyboard botKeyboard;
        int i = pq8Var.a;
        if (!(pq8Var instanceof pq8.a)) {
            if (!(pq8Var instanceof pq8.c) || (V2 = V2()) == null) {
                return null;
            }
            return (BotButton) j5g.b0(i, V2.g);
        }
        List<CarouselItem> U4 = U4();
        if (U4 == null || (botKeyboard = U4.get(((pq8.a) pq8Var).d).g) == null) {
            return null;
        }
        return (BotButton) j5g.b0(i, botKeyboard.g);
    }

    default boolean D3(Class<? extends Attach> cls, boolean z) {
        return l4(new cim0(cls, 20), z) != null;
    }

    default AttachVideoMsg D6() {
        return (AttachVideoMsg) C1125a.a(this, AttachVideoMsg.class);
    }

    default boolean E2() {
        if (K0().size() != 1) {
            return false;
        }
        Attach attach = (Attach) j5g.Y(K0());
        if (attach instanceof AttachWall) {
            if (((AttachWall) attach).o.size() != 1) {
                return false;
            }
        } else if ((attach instanceof AttachChannelMessage) && ((AttachChannelMessage) attach).g.size() != 1) {
            return false;
        }
        return true;
    }

    default boolean E7() {
        if (g8()) {
            Attach attach = K0().get(0);
            int size = K0().size();
            int i = 1;
            while (i < size) {
                Attach attach2 = K0().get(i);
                if (!attach2.getClass().equals(attach.getClass())) {
                    return false;
                }
                i++;
                attach = attach2;
            }
        }
        return true;
    }

    default boolean Ea() {
        Object obj;
        VideoFile videoFile;
        if (getBody().length() == 0 && K0().size() == 1) {
            Iterator<T> it = K0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof AttachVideo) {
                    break;
                }
            }
            AttachVideo attachVideo = (AttachVideo) (obj instanceof AttachVideo ? obj : null);
            if ((attachVideo == null || (videoFile = attachVideo.b) == null) ? false : videoFile.C2()) {
                return true;
            }
        }
        return false;
    }

    default boolean F0() {
        return D3(AttachVideoMsg.class, false);
    }

    default void F3(izs izsVar) {
        List<Attach> K0 = K0();
        int size = K0.size();
        for (int i = 0; i < size; i++) {
            izsVar.invoke(K0.get(i));
        }
        List<NestedMsg> q7 = q7();
        int size2 = q7.size();
        for (int i2 = 0; i2 < size2; i2++) {
            q7.get(i2).F3(izsVar);
        }
    }

    void I3(ArrayList arrayList);

    default void J2(Class cls, boolean z, ArrayList arrayList, boolean z2) {
        C1125a.e(this, cls, z, arrayList, z2);
    }

    default void J5() {
        m("");
        P9();
        Ba(MsgTextFormat.d);
        h3(new ArrayList());
        I3(new ArrayList());
    }

    List<Attach> K0();

    default boolean L1() {
        return l4(new tml0(12), true) != null;
    }

    default void L2(Attach attach) {
        u8(new uww0(attach, 2), new fvq0(attach, 26));
    }

    default ArrayList M9(boolean z, boolean z2) {
        ArrayList m9 = m9(AttachImage.class, z, z2);
        ArrayList m92 = m9(AttachDoc.class, z, z2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m92) {
            if (((AttachDoc) obj).i()) {
                arrayList.add(obj);
            }
        }
        return j5g.u0(arrayList, m9);
    }

    default boolean N() {
        return D3(AttachStory.class, false);
    }

    default boolean P0() {
        return D3(AttachPoll.class, false);
    }

    void P9();

    default boolean S0() {
        return D3(AttachAudioMsg.class, false);
    }

    default int S8(NestedMsg.Type type) {
        List<NestedMsg> q7 = q7();
        int size = q7.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (q7.get(i2).b == type) {
                i++;
            }
        }
        return i;
    }

    List<CarouselItem> U4();

    default int U9() {
        List<NestedMsg> q7 = q7();
        int size = q7.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (q7.get(i2).b == NestedMsg.Type.FWD) {
                i++;
            }
        }
        return i;
    }

    BotKeyboard V2();

    default ArrayList X1() {
        List<NestedMsg> q7 = q7();
        ArrayList arrayList = new ArrayList();
        for (Object obj : q7) {
            if (((NestedMsg) obj).b == NestedMsg.Type.FWD) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    default NestedMsg X5(l6u l6uVar) {
        List<NestedMsg> q7 = q7();
        NestedMsg nestedMsg = null;
        if (!q7.isEmpty()) {
            int size = q7.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                NestedMsg nestedMsg2 = q7.get(i);
                if (((Boolean) l6uVar.invoke(nestedMsg2)).booleanValue()) {
                    nestedMsg = nestedMsg2;
                    break;
                }
                i++;
            }
        }
        return nestedMsg;
    }

    default ArrayList X9(izs izsVar) {
        ArrayList arrayList = new ArrayList();
        x9(K0(), izsVar, arrayList);
        t4(q7(), izsVar, arrayList);
        return arrayList;
    }

    default ArrayList Y5(boolean z) {
        boolean z2;
        ArrayList m9 = m9(AttachForMediaViewer.class, z, false);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m9) {
            AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) obj;
            boolean z3 = attachForMediaViewer instanceof AttachImage;
            boolean z4 = attachForMediaViewer instanceof AttachVideo;
            boolean z5 = z4 && ((AttachVideo) attachForMediaViewer).b.Ia();
            if (z4) {
                AttachVideo attachVideo = (AttachVideo) attachForMediaViewer;
                if (attachVideo.b.isExternal() && myc0.f(attachVideo.b.getPlatform())) {
                    z2 = true;
                    boolean z6 = (z4 || ((AttachVideo) attachForMediaViewer).b.R7() == null) ? false : true;
                    if (!z3 || (z5 && !z2 && !z6)) {
                        arrayList.add(obj);
                    }
                }
            }
            z2 = false;
            if (z4) {
            }
            if (!z3) {
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    MsgTextFormat a4();

    default AttachAudioMsg a7() {
        if (S0()) {
            return (AttachAudioMsg) C1125a.a(this, AttachAudioMsg.class);
        }
        return null;
    }

    default AttachWall c9() {
        boolean A4 = A4(false);
        if (A4) {
            return (AttachWall) C1125a.a(this, AttachWall.class);
        }
        if (A4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ImEngineException("Msg not contains WallPost");
    }

    default boolean da() {
        return D3(AttachWithTranscription.class, false);
    }

    default boolean db() {
        List<NestedMsg> q7 = q7();
        NestedMsg nestedMsg = null;
        if (!q7.isEmpty()) {
            int size = q7.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                NestedMsg nestedMsg2 = q7.get(i);
                if (nestedMsg2.b == NestedMsg.Type.FWD) {
                    nestedMsg = nestedMsg2;
                    break;
                }
                i++;
            }
        }
        return nestedMsg != null;
    }

    default boolean g8() {
        return !K0().isEmpty();
    }

    String getBody();

    default AttachStory getStory() {
        boolean N = N();
        if (N) {
            return (AttachStory) C1125a.a(this, AttachStory.class);
        }
        if (N) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ImEngineException("Msg not contains Story");
    }

    String getTitle();

    void h3(List<Attach> list);

    default void i2(izs<? super NestedMsg, s3q0> izsVar, boolean z) {
        List<NestedMsg> q7 = q7();
        int size = q7.size();
        for (int i = 0; i < size; i++) {
            NestedMsg nestedMsg = q7.get(i);
            izsVar.invoke(nestedMsg);
            if (z) {
                nestedMsg.i2(izsVar, z);
            }
        }
    }

    default boolean j7() {
        return !q7().isEmpty();
    }

    default NestedMsg k7(NestedMsg.Type type) {
        List<NestedMsg> q7 = q7();
        NestedMsg nestedMsg = null;
        if (!q7.isEmpty()) {
            int size = q7.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                NestedMsg nestedMsg2 = q7.get(i);
                if (nestedMsg2.b == type) {
                    nestedMsg = nestedMsg2;
                    break;
                }
                i++;
            }
        }
        return nestedMsg;
    }

    default boolean k8() {
        return myc0.f(getBody());
    }

    default <T extends Attach> T l2(Class<T> cls, boolean z) {
        Attach attach;
        List<Attach> K0 = K0();
        if (!K0.isEmpty()) {
            int size = K0.size();
            for (int i = 0; i < size; i++) {
                attach = K0.get(i);
                if (attach.getClass().isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        attach = null;
        T t = (T) attach;
        if (t != null) {
            return t;
        }
        if (z) {
            List<NestedMsg> q7 = q7();
            int size2 = q7.size();
            for (int i2 = 0; i2 < size2; i2++) {
                T t2 = (T) C1125a.c(q7.get(i2), cls, z);
                if (t2 != null) {
                    return t2;
                }
            }
        }
        return null;
    }

    default Attach l4(izs<? super Attach, Boolean> izsVar, boolean z) {
        return Q7(this, izsVar, z);
    }

    void m(String str);

    default ArrayList m9(Class cls, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        J2(cls, z, arrayList, z2);
        return arrayList;
    }

    default void o3(ArrayList arrayList) {
        C1125a.b(this, arrayList);
    }

    default boolean p3() {
        List<NestedMsg> q7 = q7();
        NestedMsg nestedMsg = null;
        if (!q7.isEmpty()) {
            int size = q7.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                NestedMsg nestedMsg2 = q7.get(i);
                if (nestedMsg2.b == NestedMsg.Type.REPLY) {
                    nestedMsg = nestedMsg2;
                    break;
                }
                i++;
            }
        }
        return nestedMsg != null;
    }

    default boolean p8() {
        return l4(new eni0(22), false) != null;
    }

    default NestedMsg pa() {
        List<NestedMsg> q7 = q7();
        NestedMsg nestedMsg = null;
        if (!q7.isEmpty()) {
            int size = q7.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                NestedMsg nestedMsg2 = q7.get(i);
                if (nestedMsg2.b == NestedMsg.Type.REPLY) {
                    nestedMsg = nestedMsg2;
                    break;
                }
                i++;
            }
        }
        return nestedMsg;
    }

    List<NestedMsg> q7();

    default List<Attach> r6(List<? extends Attach> list, izs<? super Attach, Boolean> izsVar) {
        List<? extends Attach> list2 = list;
        return rli0.A(rli0.j(rli0.x(rli0.o(rli0.k(new i5g(list2), AttachWall.class), new weq0(8)), new i5g(list2)), izsVar));
    }

    default void t4(List list, izs izsVar, ArrayList arrayList) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            x9(aVar.K0(), izsVar, arrayList);
            t4(aVar.q7(), izsVar, arrayList);
        }
    }

    default void tb(v040 v040Var) {
        i2(new xvl0(v040Var, 24), false);
    }

    default void u8(izs izsVar, izs izsVar2) {
        C1125a.f(this, izsVar, izsVar2);
    }

    default boolean vb(int i) {
        return j5g.a0(X9(new e0s(i, 2))) != null;
    }

    default void wb(izs<? super NestedMsg, s3q0> izsVar) {
        i2(new d8k(izsVar, 7), false);
    }

    default Collection x7() {
        if (K0().isEmpty() && q7().isEmpty()) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        o3(arrayList);
        return arrayList;
    }

    default void x9(List list, izs izsVar, ArrayList arrayList) {
        arrayList.addAll(r6(list, izsVar));
    }
}
