package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382oe implements InterfaceC0044b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0481se f14410a;

    /* renamed from: b, reason: collision with root package name */
    public final C0245j3 f14411b;

    /* renamed from: c, reason: collision with root package name */
    public final C0477sa f14412c;

    /* renamed from: d, reason: collision with root package name */
    public final Jf f14413d;

    public C0382oe() {
        this(new C0481se(), new C0245j3(), new C0477sa(100), new Jf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(@NonNull C0357ne c0357ne) {
        Di di2;
        C0525u8 c0525u8 = new C0525u8();
        c0525u8.f14715a = c0357ne.f14351a;
        c0525u8.f14720f = new C0250j8();
        C0407pe c0407pe = c0357ne.f14352b;
        C0199h8 c0199h8 = new C0199h8();
        c0199h8.f13883a = StringUtils.getUTF8Bytes(c0407pe.f14476a);
        Mn a7 = this.f14412c.a(c0407pe.f14477b);
        c0199h8.f13884b = StringUtils.getUTF8Bytes((String) a7.f12615a);
        c0199h8.f13887e = c0407pe.f14478c.size();
        Map<String, String> map = c0407pe.f14479d;
        if (map != null) {
            di2 = this.f14410a.fromModel(map);
            c0199h8.f13885c = (C0301l8) di2.f12148a;
        } else {
            di2 = null;
        }
        c0525u8.f14720f.f14011a = c0199h8;
        int i5 = 0;
        boolean z5 = true;
        C0013a3 c0013a3 = new C0013a3(C0013a3.b(a7, di2));
        List list = c0407pe.f14478c;
        ArrayList arrayList = new ArrayList();
        this.f14413d.getClass();
        int computeInt32Size = c0525u8.f14715a != new C0525u8().f14715a ? CodedOutputByteBufferNano.computeInt32Size(1, c0525u8.f14715a) : 0;
        C0500t8 c0500t8 = c0525u8.f14716b;
        if (c0500t8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c0500t8);
        }
        C0450r8 c0450r8 = c0525u8.f14717c;
        if (c0450r8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0450r8);
        }
        C0475s8 c0475s8 = c0525u8.f14718d;
        int i10 = 4;
        if (c0475s8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0475s8);
        }
        C0096d8 c0096d8 = c0525u8.f14719e;
        if (c0096d8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0096d8);
        }
        C0250j8 c0250j8 = c0525u8.f14720f;
        if (c0250j8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0250j8);
        }
        ArrayList arrayList2 = new ArrayList();
        C0525u8 c0525u82 = new C0525u8();
        c0525u82.f14715a = c0525u8.f14715a;
        C0250j8 c0250j82 = new C0250j8();
        c0525u82.f14720f = c0250j82;
        c0250j82.f14011a = new C0199h8();
        C0199h8 c0199h82 = c0525u82.f14720f.f14011a;
        C0199h8 c0199h83 = c0525u8.f14720f.f14011a;
        c0199h82.f13884b = c0199h83.f13884b;
        c0199h82.f13883a = c0199h83.f13883a;
        c0199h82.f13887e = c0199h83.f13887e;
        c0199h82.f13885c = c0199h83.f13885c;
        C0013a3 c0013a32 = c0013a3;
        int i11 = 0;
        int i12 = computeInt32Size;
        while (i11 < list.size()) {
            C0271k3 c0271k3 = (C0271k3) list.get(i11);
            boolean z7 = z5;
            C0225i8 c0225i8 = new C0225i8();
            c0225i8.f13932a = i11;
            int i13 = i5;
            Di fromModel = this.f14411b.fromModel(c0271k3);
            c0225i8.f13933b = (C0121e8) fromModel.f12148a;
            fromModel.f12149b.getBytesTruncated();
            Di di3 = new Di(c0225i8, fromModel);
            Jf jf2 = this.f14413d;
            C0225i8 c0225i82 = (C0225i8) di3.f12148a;
            jf2.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i10);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0225i82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i13 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i12 + computeRawVarint32Size > 204800) {
                c0525u82.f14720f.f14011a.f13886d = (C0225i8[]) arrayList2.toArray(new C0225i8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Di(c0525u82, c0013a32));
                C0525u8 c0525u83 = new C0525u8();
                c0525u83.f14715a = c0525u8.f14715a;
                C0250j8 c0250j83 = new C0250j8();
                c0525u83.f14720f = c0250j83;
                c0250j83.f14011a = new C0199h8();
                C0199h8 c0199h84 = c0525u83.f14720f.f14011a;
                C0199h8 c0199h85 = c0525u8.f14720f.f14011a;
                c0199h84.f13884b = c0199h85.f13884b;
                c0199h84.f13883a = c0199h85.f13883a;
                c0199h84.f13887e = c0199h85.f13887e;
                c0199h84.f13885c = c0199h85.f13885c;
                c0013a32 = c0013a3;
                i12 = computeInt32Size;
                c0525u82 = c0525u83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0225i8) di3.f12148a);
            InterfaceC0039b3 interfaceC0039b3 = di3.f12149b;
            InterfaceC0039b3[] interfaceC0039b3Arr = new InterfaceC0039b3[2];
            interfaceC0039b3Arr[i13] = c0013a32;
            interfaceC0039b3Arr[z7 ? 1 : 0] = interfaceC0039b3;
            c0013a32 = new C0013a3(C0013a3.b(interfaceC0039b3Arr));
            i12 += computeRawVarint32Size;
            i11++;
            z5 = z7 ? 1 : 0;
            i5 = i13;
            i10 = 4;
        }
        c0525u82.f14720f.f14011a.f13886d = (C0225i8[]) arrayList2.toArray(new C0225i8[arrayList2.size()]);
        arrayList.add(new Di(c0525u82, c0013a32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0382oe(C0481se c0481se, C0245j3 c0245j3, C0477sa c0477sa, Jf jf2) {
        this.f14410a = c0481se;
        this.f14411b = c0245j3;
        this.f14412c = c0477sa;
        this.f14413d = jf2;
    }

    @NonNull
    public final C0357ne a(@NonNull List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
