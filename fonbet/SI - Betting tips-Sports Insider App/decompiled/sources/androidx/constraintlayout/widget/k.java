package androidx.constraintlayout.widget;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f1140a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1141b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1142c;

    /* renamed from: d, reason: collision with root package name */
    public final l f1143d;

    /* renamed from: e, reason: collision with root package name */
    public final o f1144e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f1145f;

    public k() {
        n nVar = new n();
        nVar.f1192a = 0;
        nVar.f1193b = 0;
        nVar.f1194c = 1.0f;
        nVar.f1195d = Float.NaN;
        this.f1141b = nVar;
        m mVar = new m();
        mVar.f1183a = -1;
        mVar.f1184b = 0;
        mVar.f1185c = -1;
        mVar.f1186d = Float.NaN;
        mVar.f1187e = Float.NaN;
        mVar.f1188f = Float.NaN;
        mVar.f1189g = -1;
        mVar.f1190h = null;
        mVar.f1191i = -1;
        this.f1142c = mVar;
        l lVar = new l();
        lVar.f1147a = false;
        lVar.f1153d = -1;
        lVar.f1155e = -1;
        lVar.f1156f = -1.0f;
        lVar.f1158g = true;
        lVar.f1160h = -1;
        lVar.f1162i = -1;
        lVar.j = -1;
        lVar.f1164k = -1;
        lVar.f1165l = -1;
        lVar.f1167m = -1;
        lVar.f1169n = -1;
        lVar.f1171o = -1;
        lVar.f1173p = -1;
        lVar.q = -1;
        lVar.f1174r = -1;
        lVar.f1175s = -1;
        lVar.f1176t = -1;
        lVar.f1177u = -1;
        lVar.f1178v = -1;
        lVar.f1179w = 0.5f;
        lVar.f1180x = 0.5f;
        lVar.f1181y = null;
        lVar.f1182z = -1;
        lVar.A = 0;
        lVar.B = 0.0f;
        lVar.C = -1;
        lVar.D = -1;
        lVar.E = -1;
        lVar.F = 0;
        lVar.G = 0;
        lVar.H = 0;
        lVar.I = 0;
        lVar.J = 0;
        lVar.K = 0;
        lVar.L = 0;
        lVar.M = Integer.MIN_VALUE;
        lVar.N = Integer.MIN_VALUE;
        lVar.O = Integer.MIN_VALUE;
        lVar.P = Integer.MIN_VALUE;
        lVar.Q = Integer.MIN_VALUE;
        lVar.R = Integer.MIN_VALUE;
        lVar.S = Integer.MIN_VALUE;
        lVar.T = -1.0f;
        lVar.U = -1.0f;
        lVar.V = 0;
        lVar.W = 0;
        lVar.X = 0;
        lVar.Y = 0;
        lVar.Z = 0;
        lVar.f1148a0 = 0;
        lVar.f1150b0 = 0;
        lVar.f1152c0 = 0;
        lVar.f1154d0 = 1.0f;
        lVar.e0 = 1.0f;
        lVar.f1157f0 = -1;
        lVar.f1159g0 = 0;
        lVar.f1161h0 = -1;
        lVar.f1166l0 = false;
        lVar.f1168m0 = false;
        lVar.f1170n0 = true;
        lVar.f1172o0 = 0;
        this.f1143d = lVar;
        o oVar = new o();
        oVar.f1197a = 0.0f;
        oVar.f1198b = 0.0f;
        oVar.f1199c = 0.0f;
        oVar.f1200d = 1.0f;
        oVar.f1201e = 1.0f;
        oVar.f1202f = Float.NaN;
        oVar.f1203g = Float.NaN;
        oVar.f1204h = -1;
        oVar.f1205i = 0.0f;
        oVar.j = 0.0f;
        oVar.f1206k = 0.0f;
        oVar.f1207l = false;
        oVar.f1208m = 0.0f;
        this.f1144e = oVar;
        this.f1145f = new HashMap();
    }

    public final void a(d dVar) {
        l lVar = this.f1143d;
        dVar.f1077e = lVar.f1160h;
        dVar.f1078f = lVar.f1162i;
        dVar.f1080g = lVar.j;
        dVar.f1082h = lVar.f1164k;
        dVar.f1084i = lVar.f1165l;
        dVar.j = lVar.f1167m;
        dVar.f1086k = lVar.f1169n;
        dVar.f1087l = lVar.f1171o;
        dVar.f1089m = lVar.f1173p;
        dVar.f1091n = lVar.q;
        dVar.f1093o = lVar.f1174r;
        dVar.f1098s = lVar.f1175s;
        dVar.f1099t = lVar.f1176t;
        dVar.f1100u = lVar.f1177u;
        dVar.f1101v = lVar.f1178v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = lVar.F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = lVar.G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = lVar.H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = lVar.I;
        dVar.A = lVar.R;
        dVar.B = lVar.Q;
        dVar.f1103x = lVar.N;
        dVar.f1105z = lVar.P;
        dVar.E = lVar.f1179w;
        dVar.F = lVar.f1180x;
        dVar.f1095p = lVar.f1182z;
        dVar.q = lVar.A;
        dVar.f1097r = lVar.B;
        dVar.G = lVar.f1181y;
        dVar.T = lVar.C;
        dVar.U = lVar.D;
        dVar.I = lVar.T;
        dVar.H = lVar.U;
        dVar.K = lVar.W;
        dVar.J = lVar.V;
        dVar.W = lVar.f1166l0;
        dVar.X = lVar.f1168m0;
        dVar.L = lVar.X;
        dVar.M = lVar.Y;
        dVar.P = lVar.Z;
        dVar.Q = lVar.f1148a0;
        dVar.N = lVar.f1150b0;
        dVar.O = lVar.f1152c0;
        dVar.R = lVar.f1154d0;
        dVar.S = lVar.e0;
        dVar.V = lVar.E;
        dVar.f1073c = lVar.f1156f;
        dVar.f1069a = lVar.f1153d;
        dVar.f1071b = lVar.f1155e;
        ((ViewGroup.MarginLayoutParams) dVar).width = lVar.f1149b;
        ((ViewGroup.MarginLayoutParams) dVar).height = lVar.f1151c;
        String str = lVar.k0;
        if (str != null) {
            dVar.Y = str;
        }
        dVar.Z = lVar.f1172o0;
        dVar.setMarginStart(lVar.K);
        dVar.setMarginEnd(lVar.J);
        dVar.a();
    }

    public final Object clone() {
        k kVar = new k();
        l lVar = kVar.f1143d;
        lVar.getClass();
        l lVar2 = this.f1143d;
        lVar.f1147a = lVar2.f1147a;
        lVar.f1149b = lVar2.f1149b;
        lVar.f1151c = lVar2.f1151c;
        lVar.f1153d = lVar2.f1153d;
        lVar.f1155e = lVar2.f1155e;
        lVar.f1156f = lVar2.f1156f;
        lVar.f1158g = lVar2.f1158g;
        lVar.f1160h = lVar2.f1160h;
        lVar.f1162i = lVar2.f1162i;
        lVar.j = lVar2.j;
        lVar.f1164k = lVar2.f1164k;
        lVar.f1165l = lVar2.f1165l;
        lVar.f1167m = lVar2.f1167m;
        lVar.f1169n = lVar2.f1169n;
        lVar.f1171o = lVar2.f1171o;
        lVar.f1173p = lVar2.f1173p;
        lVar.q = lVar2.q;
        lVar.f1174r = lVar2.f1174r;
        lVar.f1175s = lVar2.f1175s;
        lVar.f1176t = lVar2.f1176t;
        lVar.f1177u = lVar2.f1177u;
        lVar.f1178v = lVar2.f1178v;
        lVar.f1179w = lVar2.f1179w;
        lVar.f1180x = lVar2.f1180x;
        lVar.f1181y = lVar2.f1181y;
        lVar.f1182z = lVar2.f1182z;
        lVar.A = lVar2.A;
        lVar.B = lVar2.B;
        lVar.C = lVar2.C;
        lVar.D = lVar2.D;
        lVar.E = lVar2.E;
        lVar.F = lVar2.F;
        lVar.G = lVar2.G;
        lVar.H = lVar2.H;
        lVar.I = lVar2.I;
        lVar.J = lVar2.J;
        lVar.K = lVar2.K;
        lVar.L = lVar2.L;
        lVar.M = lVar2.M;
        lVar.N = lVar2.N;
        lVar.O = lVar2.O;
        lVar.P = lVar2.P;
        lVar.Q = lVar2.Q;
        lVar.R = lVar2.R;
        lVar.S = lVar2.S;
        lVar.T = lVar2.T;
        lVar.U = lVar2.U;
        lVar.V = lVar2.V;
        lVar.W = lVar2.W;
        lVar.X = lVar2.X;
        lVar.Y = lVar2.Y;
        lVar.Z = lVar2.Z;
        lVar.f1148a0 = lVar2.f1148a0;
        lVar.f1150b0 = lVar2.f1150b0;
        lVar.f1152c0 = lVar2.f1152c0;
        lVar.f1154d0 = lVar2.f1154d0;
        lVar.e0 = lVar2.e0;
        lVar.f1157f0 = lVar2.f1157f0;
        lVar.f1159g0 = lVar2.f1159g0;
        lVar.f1161h0 = lVar2.f1161h0;
        lVar.k0 = lVar2.k0;
        int[] iArr = lVar2.f1163i0;
        if (iArr == null || lVar2.j0 != null) {
            lVar.f1163i0 = null;
        } else {
            lVar.f1163i0 = Arrays.copyOf(iArr, iArr.length);
        }
        lVar.j0 = lVar2.j0;
        lVar.f1166l0 = lVar2.f1166l0;
        lVar.f1168m0 = lVar2.f1168m0;
        lVar.f1170n0 = lVar2.f1170n0;
        lVar.f1172o0 = lVar2.f1172o0;
        m mVar = kVar.f1142c;
        mVar.getClass();
        m mVar2 = this.f1142c;
        mVar2.getClass();
        mVar.f1183a = mVar2.f1183a;
        mVar.f1185c = mVar2.f1185c;
        mVar.f1187e = mVar2.f1187e;
        mVar.f1186d = mVar2.f1186d;
        n nVar = this.f1141b;
        int i5 = nVar.f1192a;
        n nVar2 = kVar.f1141b;
        nVar2.f1192a = i5;
        nVar2.f1194c = nVar.f1194c;
        nVar2.f1195d = nVar.f1195d;
        nVar2.f1193b = nVar.f1193b;
        o oVar = kVar.f1144e;
        oVar.getClass();
        o oVar2 = this.f1144e;
        oVar2.getClass();
        oVar.f1197a = oVar2.f1197a;
        oVar.f1198b = oVar2.f1198b;
        oVar.f1199c = oVar2.f1199c;
        oVar.f1200d = oVar2.f1200d;
        oVar.f1201e = oVar2.f1201e;
        oVar.f1202f = oVar2.f1202f;
        oVar.f1203g = oVar2.f1203g;
        oVar.f1204h = oVar2.f1204h;
        oVar.f1205i = oVar2.f1205i;
        oVar.j = oVar2.j;
        oVar.f1206k = oVar2.f1206k;
        oVar.f1207l = oVar2.f1207l;
        oVar.f1208m = oVar2.f1208m;
        kVar.f1140a = this.f1140a;
        return kVar;
    }
}
