package com.vk.video.polls.data;

import com.vk.dto.uxpolls.ChipOption;
import com.vk.video.polls.data.a;
import com.vk.video.polls.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.b9y;
import xsna.c5g;
import xsna.go9;
import xsna.l8y;
import xsna.x9y;
import xsna.z8y;

/* compiled from: UxPollQuestionDeserializer.kt */
/* loaded from: classes6.dex */
public final class UxPollQuestionDeserializer implements a9y<b> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static a b(x9y x9yVar) {
        b9y q = x9yVar.q("conditions");
        if (q == null) {
            return null;
        }
        x9y h = q.h();
        String k = h.q("predicate").k();
        if (k != null) {
            switch (k.hashCode()) {
                case 3555:
                    if (k.equals("or")) {
                        l8y g = h.q("items").g();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = g.b.iterator();
                        while (it.hasNext()) {
                            a b = b(((b9y) it.next()).h());
                            if (b != null) {
                                arrayList.add(b);
                            }
                        }
                        return new a.e(arrayList);
                    }
                    break;
                case 96727:
                    if (k.equals("and")) {
                        l8y g2 = h.q("items").g();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = g2.b.iterator();
                        while (it2.hasNext()) {
                            a b2 = b(((b9y) it2.next()).h());
                            if (b2 != null) {
                                arrayList2.add(b2);
                            }
                        }
                        return new a.C1953a(arrayList2);
                    }
                    break;
                case 677084836:
                    if (k.equals("answer_has_numbers")) {
                        int f = h.q("question_id").f();
                        l8y g3 = h.q("numbers").g();
                        ArrayList arrayList3 = new ArrayList(c5g.u(g3, 10));
                        Iterator it3 = g3.b.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(Integer.valueOf(((b9y) it3.next()).f()));
                        }
                        return new a.d(f, arrayList3);
                    }
                    break;
                case 1692054873:
                    if (k.equals("answer_is_empty")) {
                        return new a.c(h.q("question_id").f());
                    }
                    break;
                case 1823365507:
                    if (k.equals("answer_has_words")) {
                        int f2 = h.q("question_id").f();
                        l8y g4 = h.q("words").g();
                        ArrayList arrayList4 = new ArrayList(c5g.u(g4, 10));
                        Iterator it4 = g4.b.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((b9y) it4.next()).k());
                        }
                        return new a.b(f2, arrayList4);
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(go9.b("no mappings for the predicate: ", k));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.a9y
    public final Object a(b9y b9yVar, z8y z8yVar) {
        b.a.C1954a c1954a;
        x9y h = b9yVar.h();
        int f = h.q("id").f();
        String k = h.q("statement").k();
        String k2 = h.q("type").k();
        if (k2 != null) {
            switch (k2.hashCode()) {
                case -121159144:
                    if (k2.equals("checkboxes_open")) {
                        a b = b(h);
                        b9y q = h.q("open_answer_placeholder");
                        if (q != null) {
                            String k3 = q.k();
                            b9y q2 = h.q("is_comment_open");
                            boolean d = q2 != null ? q2.d() : false;
                            b9y q3 = h.q("is_comment_required");
                            c1954a = new b.a.C1954a(k3, d, q3 != null ? q3.d() : false);
                        } else {
                            c1954a = null;
                        }
                        b.a.C1954a c1954a2 = c1954a;
                        l8y g = h.q(SignalingProtocol.KEY_OPTIONS).g();
                        ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                        Iterator it = g.b.iterator();
                        while (it.hasNext()) {
                            x9y h2 = ((b9y) it.next()).h();
                            arrayList.add(new ChipOption(h2.q("index").f(), h2.q("text").k(), h2.q("is_open").d()));
                        }
                        return new b.a(f, k, b, arrayList, c1954a2);
                    }
                    break;
                case 3417674:
                    if (k2.equals("open")) {
                        return new b.c(f, k, b(h), h.q("open_answer_placeholder").k());
                    }
                    break;
                case 98615255:
                    if (k2.equals("grade")) {
                        return new b.C1955b(f, k, b(h), h.q("grade_max").f(), h.q("grade_min_description").k(), h.q("grade_max_description").k());
                    }
                    break;
                case 1841121322:
                    if (k2.equals("star_rating")) {
                        return new b.d(f, k, b(h), h.q("rating_max").f());
                    }
                    break;
            }
        }
        throw new IllegalArgumentException(go9.b("no mappings for the type: ", k2));
    }
}
