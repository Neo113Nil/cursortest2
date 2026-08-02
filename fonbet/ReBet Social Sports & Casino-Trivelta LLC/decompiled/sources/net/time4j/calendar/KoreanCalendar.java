package net.time4j.calendar;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import mi.AbstractC5590a;
import mi.C5591b;
import mi.C5592c;
import mi.g;
import mi.i;
import mi.j;
import mi.l;
import mi.o;
import net.time4j.F;
import net.time4j.a0;
import net.time4j.calendar.a;
import net.time4j.format.h;
import net.time4j.format.t;
import oi.H;
import oi.InterfaceC5908d;
import oi.InterfaceC5915k;
import oi.N;
import oi.p;
import oi.q;
import oi.w;
import oi.z;

/* loaded from: classes5.dex */
public final class KoreanCalendar extends mi.d implements h {
    private static final int[] LEAP_MONTHS = {4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 4295, 3, 4297, 7, 4300, 6, 4303, 4, 4306, 2, 4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 4363, 2, 4365, 7, 4368, 5, 4371, 3, 4373, 9, 4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 4390, 4, 4392, 9, 4395, 6, 4398, 5, 4401, 2, 4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 4417, 5, 4420, 3, 4422, 7, 4425, 6, 4428, 4, 4431, 2, 4433, 6, 4436, 4, 4439, 3, 4441, 6, 4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 11, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4525, 12, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 3, 4650, 9, 4653, 5, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 3, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 9, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 4, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 7, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 8, 4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4955, 2, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 2, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 6, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 8, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 5, 5153, 4, 5156, 2, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 5177, 7, 5180, 5, 5183, 3, 5185, 8, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 5204, 8, 5207, 6, 5210, 4, 5212, 8, 5215, 7, 5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 5, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 8, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5345, 10, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 1, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 11, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 4, 5633, 9, 5636, 6
    };

    /* renamed from: g, reason: collision with root package name */
    public static final p f57735g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f57736h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f57737i;

    /* renamed from: j, reason: collision with root package name */
    public static final t f57738j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f57739k;

    /* renamed from: l, reason: collision with root package name */
    public static final t f57740l;

    /* renamed from: m, reason: collision with root package name */
    public static final o f57741m;

    /* renamed from: n, reason: collision with root package name */
    public static final o f57742n;

    /* renamed from: o, reason: collision with root package name */
    public static final o f57743o;

    /* renamed from: p, reason: collision with root package name */
    public static final o f57744p;

    /* renamed from: q, reason: collision with root package name */
    public static final mi.p f57745q;

    /* renamed from: r, reason: collision with root package name */
    public static final j f57746r;

    /* renamed from: s, reason: collision with root package name */
    public static final net.time4j.calendar.b f57747s;
    private static final long serialVersionUID = -4284841131270593971L;

    /* renamed from: t, reason: collision with root package name */
    public static final H f57748t;

    public static class SPX implements Externalizable {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public transient Object f57749a;

        public SPX(Object obj) {
            this.f57749a = obj;
        }

        private Object readResolve() {
            return this.f57749a;
        }

        public final KoreanCalendar a(ObjectInput objectInput) {
            byte readByte = objectInput.readByte();
            byte readByte2 = objectInput.readByte();
            byte readByte3 = objectInput.readByte();
            boolean readBoolean = objectInput.readBoolean();
            byte readByte4 = objectInput.readByte();
            mi.f d10 = mi.f.d(readByte3);
            if (readBoolean) {
                d10 = d10.e();
            }
            return KoreanCalendar.f0(readByte, readByte2, d10, readByte4);
        }

        public final void b(ObjectOutput objectOutput) {
            mi.d dVar = (mi.d) this.f57749a;
            objectOutput.writeByte(dVar.P());
            objectOutput.writeByte(dVar.Z().getNumber());
            objectOutput.writeByte(dVar.V().getNumber());
            objectOutput.writeBoolean(dVar.V().c());
            objectOutput.writeByte(dVar.p());
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) {
            if (objectInput.readByte() != 15) {
                throw new InvalidObjectException("Unknown calendar type.");
            }
            this.f57749a = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeByte(15);
            b(objectOutput);
        }
    }

    public static class a implements oi.t {
        @Override // oi.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5915k apply(KoreanCalendar koreanCalendar) {
            return KoreanCalendar.f57747s;
        }
    }

    public static class b implements z {
        public b() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p b(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p d(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public i e(KoreanCalendar koreanCalendar) {
            return i.DANGI;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public i i(KoreanCalendar koreanCalendar) {
            return i.DANGI;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public i p(KoreanCalendar koreanCalendar) {
            return i.DANGI;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar q(KoreanCalendar koreanCalendar, i iVar, boolean z10) {
            if (isValid(koreanCalendar, iVar)) {
                return koreanCalendar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + iVar);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // oi.z
        public boolean isValid(KoreanCalendar koreanCalendar, i iVar) {
            return iVar == i.DANGI;
        }
    }

    public static class c extends AbstractC5590a {
        public c() {
            super(KoreanCalendar.class);
        }

        @Override // oi.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar e(q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
            mi.h b10;
            int e10 = qVar.e(net.time4j.calendar.a.f57761a);
            if (e10 == Integer.MIN_VALUE) {
                t tVar = KoreanCalendar.f57738j;
                if (qVar.f(tVar)) {
                    p pVar = KoreanCalendar.f57736h;
                    if (qVar.f(pVar)) {
                        b10 = ((C5591b) qVar.j(tVar)).m(qVar.e(pVar));
                    }
                }
                int e11 = qVar.e(i.DANGI.c());
                b10 = e11 != Integer.MIN_VALUE ? mi.h.a(e11) : null;
            } else {
                b10 = mi.h.b(e10);
            }
            if (b10 == null) {
                qVar.y(N.ERROR_MESSAGE, "Cannot determine East Asian year.");
                return null;
            }
            t tVar2 = KoreanCalendar.f57740l;
            if (qVar.f(tVar2)) {
                mi.f fVar = (mi.f) qVar.j(tVar2);
                int e12 = qVar.e(KoreanCalendar.f57742n);
                if (e12 != Integer.MIN_VALUE) {
                    return KoreanCalendar.g0(b10, fVar, e12);
                }
            } else {
                int e13 = qVar.e(KoreanCalendar.f57743o);
                if (e13 != Integer.MIN_VALUE && e13 >= 1) {
                    return (KoreanCalendar) KoreanCalendar.g0(b10, mi.f.d(1), 1).E(e13 - 1, e.DAYS);
                }
            }
            return null;
        }
    }

    public static class d extends net.time4j.calendar.b {

        /* renamed from: d, reason: collision with root package name */
        public static final List f57750d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f57751e;

        /* renamed from: f, reason: collision with root package name */
        public static final long f57752f;

        /* renamed from: g, reason: collision with root package name */
        public static final long f57753g;

        /* renamed from: h, reason: collision with root package name */
        public static final long f57754h;

        static {
            ArrayList arrayList = new ArrayList(5);
            net.time4j.tz.f fVar = net.time4j.tz.f.AHEAD_OF_UTC;
            arrayList.add(net.time4j.tz.p.c(fVar, 126, 58, 0.0d));
            arrayList.add(net.time4j.tz.p.o(fVar, 8, 30));
            arrayList.add(net.time4j.tz.p.o(fVar, 9, 0));
            arrayList.add(net.time4j.tz.p.o(fVar, 8, 30));
            arrayList.add(net.time4j.tz.p.o(fVar, 9, 0));
            f57750d = Collections.unmodifiableList(arrayList);
            f57751e = F.B0(1908, 4, 1).b();
            f57752f = F.B0(1912, 1, 1).b();
            f57753g = F.B0(1954, 3, 21).b();
            f57754h = F.B0(1961, 8, 10).b();
        }

        public d() {
        }

        @Override // net.time4j.calendar.b
        public int[] h() {
            return KoreanCalendar.LEAP_MONTHS;
        }

        @Override // net.time4j.calendar.b
        public net.time4j.tz.p i(long j10) {
            return j10 < f57751e ? (net.time4j.tz.p) f57750d.get(0) : j10 < f57752f ? (net.time4j.tz.p) f57750d.get(1) : j10 < f57753g ? (net.time4j.tz.p) f57750d.get(2) : j10 < f57754h ? (net.time4j.tz.p) f57750d.get(3) : (net.time4j.tz.p) f57750d.get(4);
        }

        @Override // net.time4j.calendar.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar e(int i10, int i11, mi.f fVar, int i12, long j10) {
            return new KoreanCalendar(i10, i11, fVar, i12, j10, null);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public enum e implements w {
        CYCLES(1.893415507776E9d),
        YEARS(3.15569251296E7d),
        MONTHS(2551442.8775903997d),
        WEEKS(604800.0d),
        DAYS(86400.0d);


        /* renamed from: a, reason: collision with root package name */
        public final transient double f57760a;

        e(double d10) {
            this.f57760a = d10;
        }

        @Override // oi.w
        public double getLength() {
            return this.f57760a;
        }
    }

    public static class f implements z {
        public f() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p b(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p d(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError("Never called.");
        }

        public final int f(KoreanCalendar koreanCalendar) {
            return ((koreanCalendar.P() * 60) + koreanCalendar.Z().getNumber()) - 364;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer e(KoreanCalendar koreanCalendar) {
            return 5332;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer i(KoreanCalendar koreanCalendar) {
            return 3978;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer p(KoreanCalendar koreanCalendar) {
            return Integer.valueOf(f(koreanCalendar));
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar q(KoreanCalendar koreanCalendar, Integer num, boolean z10) {
            if (num == null) {
                throw new IllegalArgumentException("Missing year of era.");
            }
            if (isValid(koreanCalendar, num)) {
                return (KoreanCalendar) koreanCalendar.E(num.intValue() - f(koreanCalendar), e.YEARS);
            }
            throw new IllegalArgumentException("Invalid year of era: " + num);
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        @Override // oi.z
        public boolean isValid(KoreanCalendar koreanCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= i(koreanCalendar).intValue() && num.intValue() <= e(koreanCalendar).intValue();
        }
    }

    static {
        i iVar = i.DANGI;
        p a10 = iVar.a();
        f57735g = a10;
        ni.f fVar = new ni.f("CYCLE", KoreanCalendar.class, 72, 94, (char) 0, null, null);
        f57736h = fVar;
        p c10 = iVar.c();
        f57737i = c10;
        C5592c c5592c = C5592c.f56617a;
        f57738j = c5592c;
        g v10 = g.v();
        f57739k = v10;
        mi.e eVar = mi.e.f56630a;
        f57740l = eVar;
        ni.f fVar2 = new ni.f("MONTH_AS_ORDINAL", KoreanCalendar.class, 1, 12, (char) 0, null, null);
        f57741m = fVar2;
        ni.f fVar3 = new ni.f("DAY_OF_MONTH", KoreanCalendar.class, 1, 30, 'd');
        f57742n = fVar3;
        ni.f fVar4 = new ni.f("DAY_OF_YEAR", KoreanCalendar.class, 1, 355, 'D');
        f57743o = fVar4;
        ni.g gVar = new ni.g(KoreanCalendar.class, e0());
        f57744p = gVar;
        mi.p pVar = new mi.p(KoreanCalendar.class, fVar3, gVar);
        f57745q = pVar;
        f57746r = pVar;
        a aVar = null;
        d dVar = new d(aVar);
        f57747s = dVar;
        H.b d10 = H.b.j(e.class, KoreanCalendar.class, new c(), dVar).d(a10, new b(aVar)).d(fVar, mi.d.Q(c5592c));
        f fVar5 = new f(aVar);
        e eVar2 = e.YEARS;
        H.b d11 = d10.e(c10, fVar5, eVar2).e(c5592c, mi.d.a0(eVar), eVar2).d(v10, g.v());
        z X10 = mi.d.X(fVar3);
        e eVar3 = e.MONTHS;
        H.b e10 = d11.e(eVar, X10, eVar3).e(fVar2, mi.d.W(fVar3), eVar3);
        z R10 = mi.d.R();
        e eVar4 = e.DAYS;
        H.b d12 = e10.e(fVar3, R10, eVar4).e(fVar4, mi.d.T(), eVar4).e(gVar, new mi.q(e0(), new a()), eVar4).d(pVar, mi.p.C(pVar)).d(net.time4j.calendar.a.f57761a, new l(dVar, fVar4));
        e eVar5 = e.CYCLES;
        H.b g10 = d12.g(eVar5, mi.d.Y(0), eVar5.getLength(), Collections.singleton(eVar2)).g(eVar2, mi.d.Y(1), eVar2.getLength(), Collections.singleton(eVar5)).g(eVar3, mi.d.Y(2), eVar3.getLength(), Collections.EMPTY_SET);
        e eVar6 = e.WEEKS;
        f57748t = g10.g(eVar6, mi.d.Y(3), eVar6.getLength(), Collections.singleton(eVar4)).g(eVar4, mi.d.Y(4), eVar4.getLength(), Collections.singleton(eVar6)).f(new a.g(KoreanCalendar.class, fVar3, fVar4, e0())).h();
    }

    public /* synthetic */ KoreanCalendar(int i10, int i11, mi.f fVar, int i12, long j10, a aVar) {
        this(i10, i11, fVar, i12, j10);
    }

    public static a0 e0() {
        return a0.j(new Locale("ko", "KR"));
    }

    public static KoreanCalendar f0(int i10, int i11, mi.f fVar, int i12) {
        return new KoreanCalendar(i10, i11, fVar, i12, f57747s.t(i10, i11, fVar, i12));
    }

    public static KoreanCalendar g0(mi.h hVar, mi.f fVar, int i10) {
        return f0(hVar.c(), hVar.e().getNumber(), fVar, i10);
    }

    public static boolean isValid(mi.h hVar, mi.f fVar, int i10) {
        return f57747s.l(hVar.c(), hVar.e().getNumber(), fVar, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    @Override // oi.q
    /* renamed from: B */
    public H s() {
        return f57748t;
    }

    @Override // mi.d
    public net.time4j.calendar.b O() {
        return f57747s;
    }

    @Override // oi.q
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public KoreanCalendar t() {
        return this;
    }

    public KoreanCalendar(int i10, int i11, mi.f fVar, int i12, long j10) {
        super(i10, i11, fVar, i12, j10);
    }
}
