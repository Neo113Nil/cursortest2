package ub;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.sports.insider.R;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k2.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y1.b0;
import y1.d0;
import y1.j0;
import y1.r;
import y1.s;
import y1.v0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24168a;

    public /* synthetic */ b(int i5) {
        this.f24168a = i5;
    }

    private final Object a(Object obj) {
        Context it = (Context) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    private final Object b(Object obj) {
        Context it = (Context) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }

    private final Object c(Object obj) {
        b0 it = (b0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.f25535c;
    }

    private final Object d(Object obj) {
        b0 it = (b0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof d0)) {
            return null;
        }
        d0 d0Var = (d0) it;
        return d0Var.i(d0Var.f25543g.f3078a);
    }

    private final Object e(Object obj) {
        View it = (View) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private final Object f(Object obj) {
        View it = (View) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (r) ((WeakReference) tag).get();
        }
        if (tag instanceof r) {
            return (r) tag;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        int i5;
        Integer valueOf;
        int i10;
        Integer valueOf2;
        int i11;
        int i12;
        Integer valueOf3;
        int i13;
        Integer valueOf4;
        int i14;
        Integer valueOf5;
        int i15;
        int i16;
        int i17;
        Integer valueOf6;
        int i18;
        Integer valueOf7;
        int i19;
        int i20;
        Integer valueOf8;
        int i21;
        Integer valueOf9;
        int i22;
        Integer valueOf10;
        int i23;
        int i24;
        int i25;
        Integer valueOf11;
        int i26;
        Integer valueOf12;
        int i27;
        int i28;
        Integer valueOf13;
        int i29;
        Integer valueOf14;
        int i30;
        Integer valueOf15;
        int i31;
        int i32;
        int i33;
        int i34;
        Integer valueOf16;
        int i35;
        int i36;
        Integer valueOf17;
        int i37;
        int i38;
        Integer valueOf18;
        int i39;
        Integer valueOf19;
        int i40;
        Integer valueOf20;
        int i41;
        switch (this.f24168a) {
            case 0:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT table_prediction_preview.* FROM table_prediction_preview WHERE  id IN ( SELECT favorite_table.idPrediction FROM favorite_table   ) ORDER BY startTime DESC");
                try {
                    int r5 = x.r(r02, "id");
                    int r6 = x.r(r02, PredictionTable.startTimeColumn);
                    int r10 = x.r(r02, PredictionTable.publicationColumn);
                    int r11 = x.r(r02, "type");
                    int r12 = x.r(r02, PredictionTable.statusColumn);
                    int r13 = x.r(r02, PredictionTable.imageBackgroundColumn);
                    int r14 = x.r(r02, PredictionTable.oddsColumn);
                    int r15 = x.r(r02, "purchased");
                    int r16 = x.r(r02, PredictionTable.forecastsColumn);
                    int r17 = x.r(r02, PredictionTable.arrayKindColumn);
                    int r18 = x.r(r02, PredictionTable.oddsForecastColumn);
                    int r19 = x.r(r02, PredictionTable.forecastColumn);
                    int r20 = x.r(r02, PredictionTable.teamHomeIdColumn);
                    int r21 = x.r(r02, PredictionTable.teamGuestIdColumn);
                    int r22 = x.r(r02, PredictionTable.teamHomeFlagColumn);
                    int r23 = x.r(r02, PredictionTable.teamGuestFlagColumn);
                    int r24 = x.r(r02, PredictionTable.teamHomeNameColumn);
                    int r25 = x.r(r02, PredictionTable.teamGuestNameColumn);
                    int r26 = x.r(r02, PredictionTable.scoreHomeColumn);
                    int r27 = x.r(r02, PredictionTable.scoreGuestColumn);
                    int r28 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
                    int r29 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        int i42 = r21;
                        ArrayList arrayList2 = arrayList;
                        int i43 = (int) r02.getLong(r5);
                        int i44 = (int) r02.getLong(r6);
                        int i45 = (int) r02.getLong(r10);
                        int i46 = r6;
                        int i47 = r10;
                        int i48 = (int) r02.getLong(r11);
                        Integer num = null;
                        String V = r02.isNull(r12) ? null : r02.V(r12);
                        String V2 = r02.isNull(r13) ? null : r02.V(r13);
                        String V3 = r02.isNull(r14) ? null : r02.V(r14);
                        int i49 = (int) r02.getLong(r15);
                        String V4 = r02.isNull(r16) ? null : r02.V(r16);
                        String V5 = r02.isNull(r17) ? null : r02.V(r17);
                        String V6 = r02.isNull(r18) ? null : r02.V(r18);
                        String V7 = r02.isNull(r19) ? null : r02.V(r19);
                        if (r02.isNull(r20)) {
                            i5 = i49;
                            valueOf = null;
                        } else {
                            i5 = i49;
                            valueOf = Integer.valueOf((int) r02.getLong(r20));
                        }
                        if (r02.isNull(i42)) {
                            i10 = r11;
                            valueOf2 = null;
                        } else {
                            i10 = r11;
                            valueOf2 = Integer.valueOf((int) r02.getLong(i42));
                        }
                        int i50 = r22;
                        String V8 = r02.isNull(i50) ? null : r02.V(i50);
                        int i51 = r23;
                        String V9 = r02.isNull(i51) ? null : r02.V(i51);
                        int i52 = r5;
                        int i53 = r24;
                        String V10 = r02.isNull(i53) ? null : r02.V(i53);
                        r24 = i53;
                        int i54 = r25;
                        String V11 = r02.isNull(i54) ? null : r02.V(i54);
                        r25 = i54;
                        int i55 = r26;
                        if (r02.isNull(i55)) {
                            i11 = i42;
                            i12 = i50;
                            valueOf3 = null;
                        } else {
                            i11 = i42;
                            i12 = i50;
                            valueOf3 = Integer.valueOf((int) r02.getLong(i55));
                        }
                        int i56 = r27;
                        if (r02.isNull(i56)) {
                            i13 = i51;
                            valueOf4 = null;
                        } else {
                            i13 = i51;
                            valueOf4 = Integer.valueOf((int) r02.getLong(i56));
                        }
                        int i57 = r28;
                        if (r02.isNull(i57)) {
                            i14 = r12;
                            valueOf5 = null;
                        } else {
                            i14 = r12;
                            valueOf5 = Integer.valueOf((int) r02.getLong(i57));
                        }
                        int i58 = r29;
                        if (r02.isNull(i58)) {
                            i15 = i56;
                            i16 = i57;
                        } else {
                            i15 = i56;
                            i16 = i57;
                            num = Integer.valueOf((int) r02.getLong(i58));
                        }
                        arrayList2.add(new ja.c(i43, i44, i45, i48, V, V3, V2, V6, V7, i5, V5, V4, valueOf3, valueOf4, valueOf5, num, valueOf, valueOf2, V8, V9, V10, V11));
                        r5 = i52;
                        r22 = i12;
                        r26 = i55;
                        r6 = i46;
                        r21 = i11;
                        r23 = i13;
                        arrayList = arrayList2;
                        r27 = i15;
                        r12 = i14;
                        r28 = i16;
                        r10 = i47;
                        r29 = i58;
                        r11 = i10;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("SELECT table_prediction_preview.* FROM table_prediction_preview WHERE publication != 0 ORDER BY startTime DESC");
                try {
                    int r30 = x.r(r02, "id");
                    int r31 = x.r(r02, PredictionTable.startTimeColumn);
                    int r32 = x.r(r02, PredictionTable.publicationColumn);
                    int r33 = x.r(r02, "type");
                    int r34 = x.r(r02, PredictionTable.statusColumn);
                    int r35 = x.r(r02, PredictionTable.imageBackgroundColumn);
                    int r36 = x.r(r02, PredictionTable.oddsColumn);
                    int r37 = x.r(r02, "purchased");
                    int r38 = x.r(r02, PredictionTable.forecastsColumn);
                    int r39 = x.r(r02, PredictionTable.arrayKindColumn);
                    int r40 = x.r(r02, PredictionTable.oddsForecastColumn);
                    int r41 = x.r(r02, PredictionTable.forecastColumn);
                    int r42 = x.r(r02, PredictionTable.teamHomeIdColumn);
                    int r43 = x.r(r02, PredictionTable.teamGuestIdColumn);
                    int r44 = x.r(r02, PredictionTable.teamHomeFlagColumn);
                    int r45 = x.r(r02, PredictionTable.teamGuestFlagColumn);
                    int r46 = x.r(r02, PredictionTable.teamHomeNameColumn);
                    int r47 = x.r(r02, PredictionTable.teamGuestNameColumn);
                    int r48 = x.r(r02, PredictionTable.scoreHomeColumn);
                    int r49 = x.r(r02, PredictionTable.scoreGuestColumn);
                    int r50 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
                    int r51 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
                    ArrayList arrayList3 = new ArrayList();
                    while (r02.n0()) {
                        int i59 = r43;
                        ArrayList arrayList4 = arrayList3;
                        int i60 = (int) r02.getLong(r30);
                        int i61 = (int) r02.getLong(r31);
                        int i62 = (int) r02.getLong(r32);
                        int i63 = r31;
                        int i64 = r32;
                        int i65 = (int) r02.getLong(r33);
                        Integer num2 = null;
                        String V12 = r02.isNull(r34) ? null : r02.V(r34);
                        String V13 = r02.isNull(r35) ? null : r02.V(r35);
                        String V14 = r02.isNull(r36) ? null : r02.V(r36);
                        int i66 = (int) r02.getLong(r37);
                        String V15 = r02.isNull(r38) ? null : r02.V(r38);
                        String V16 = r02.isNull(r39) ? null : r02.V(r39);
                        String V17 = r02.isNull(r40) ? null : r02.V(r40);
                        String V18 = r02.isNull(r41) ? null : r02.V(r41);
                        if (r02.isNull(r42)) {
                            i17 = i66;
                            valueOf6 = null;
                        } else {
                            i17 = i66;
                            valueOf6 = Integer.valueOf((int) r02.getLong(r42));
                        }
                        if (r02.isNull(i59)) {
                            i18 = r33;
                            valueOf7 = null;
                        } else {
                            i18 = r33;
                            valueOf7 = Integer.valueOf((int) r02.getLong(i59));
                        }
                        int i67 = r44;
                        String V19 = r02.isNull(i67) ? null : r02.V(i67);
                        int i68 = r45;
                        String V20 = r02.isNull(i68) ? null : r02.V(i68);
                        int i69 = r30;
                        int i70 = r46;
                        String V21 = r02.isNull(i70) ? null : r02.V(i70);
                        r46 = i70;
                        int i71 = r47;
                        String V22 = r02.isNull(i71) ? null : r02.V(i71);
                        r47 = i71;
                        int i72 = r48;
                        if (r02.isNull(i72)) {
                            i19 = i59;
                            i20 = i67;
                            valueOf8 = null;
                        } else {
                            i19 = i59;
                            i20 = i67;
                            valueOf8 = Integer.valueOf((int) r02.getLong(i72));
                        }
                        int i73 = r49;
                        if (r02.isNull(i73)) {
                            i21 = i68;
                            valueOf9 = null;
                        } else {
                            i21 = i68;
                            valueOf9 = Integer.valueOf((int) r02.getLong(i73));
                        }
                        int i74 = r50;
                        if (r02.isNull(i74)) {
                            i22 = r34;
                            valueOf10 = null;
                        } else {
                            i22 = r34;
                            valueOf10 = Integer.valueOf((int) r02.getLong(i74));
                        }
                        int i75 = r51;
                        if (r02.isNull(i75)) {
                            i23 = i73;
                            i24 = i74;
                        } else {
                            i23 = i73;
                            i24 = i74;
                            num2 = Integer.valueOf((int) r02.getLong(i75));
                        }
                        arrayList4.add(new ja.c(i60, i61, i62, i65, V12, V14, V13, V17, V18, i17, V16, V15, valueOf8, valueOf9, valueOf10, num2, valueOf6, valueOf7, V19, V20, V21, V22));
                        r30 = i69;
                        r44 = i20;
                        r48 = i72;
                        r31 = i63;
                        r43 = i19;
                        r45 = i21;
                        arrayList3 = arrayList4;
                        r49 = i23;
                        r34 = i22;
                        r50 = i24;
                        r32 = i64;
                        r51 = i75;
                        r33 = i18;
                    }
                    return arrayList3;
                } finally {
                }
            case 2:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT table_prediction_preview.* FROM table_prediction_preview WHERE publication != 0 AND id IN ( SELECT favorite_table.idPrediction FROM favorite_table ) ORDER BY startTime DESC");
                try {
                    int r52 = x.r(r02, "id");
                    int r53 = x.r(r02, PredictionTable.startTimeColumn);
                    int r54 = x.r(r02, PredictionTable.publicationColumn);
                    int r55 = x.r(r02, "type");
                    int r56 = x.r(r02, PredictionTable.statusColumn);
                    int r57 = x.r(r02, PredictionTable.imageBackgroundColumn);
                    int r58 = x.r(r02, PredictionTable.oddsColumn);
                    int r59 = x.r(r02, "purchased");
                    int r60 = x.r(r02, PredictionTable.forecastsColumn);
                    int r61 = x.r(r02, PredictionTable.arrayKindColumn);
                    int r62 = x.r(r02, PredictionTable.oddsForecastColumn);
                    int r63 = x.r(r02, PredictionTable.forecastColumn);
                    int r64 = x.r(r02, PredictionTable.teamHomeIdColumn);
                    int r65 = x.r(r02, PredictionTable.teamGuestIdColumn);
                    int r66 = x.r(r02, PredictionTable.teamHomeFlagColumn);
                    int r67 = x.r(r02, PredictionTable.teamGuestFlagColumn);
                    int r68 = x.r(r02, PredictionTable.teamHomeNameColumn);
                    int r69 = x.r(r02, PredictionTable.teamGuestNameColumn);
                    int r70 = x.r(r02, PredictionTable.scoreHomeColumn);
                    int r71 = x.r(r02, PredictionTable.scoreGuestColumn);
                    int r72 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
                    int r73 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
                    ArrayList arrayList5 = new ArrayList();
                    while (r02.n0()) {
                        int i76 = r65;
                        ArrayList arrayList6 = arrayList5;
                        int i77 = (int) r02.getLong(r52);
                        int i78 = (int) r02.getLong(r53);
                        int i79 = (int) r02.getLong(r54);
                        int i80 = r53;
                        int i81 = r54;
                        int i82 = (int) r02.getLong(r55);
                        Integer num3 = null;
                        String V23 = r02.isNull(r56) ? null : r02.V(r56);
                        String V24 = r02.isNull(r57) ? null : r02.V(r57);
                        String V25 = r02.isNull(r58) ? null : r02.V(r58);
                        int i83 = (int) r02.getLong(r59);
                        String V26 = r02.isNull(r60) ? null : r02.V(r60);
                        String V27 = r02.isNull(r61) ? null : r02.V(r61);
                        String V28 = r02.isNull(r62) ? null : r02.V(r62);
                        String V29 = r02.isNull(r63) ? null : r02.V(r63);
                        if (r02.isNull(r64)) {
                            i25 = i83;
                            valueOf11 = null;
                        } else {
                            i25 = i83;
                            valueOf11 = Integer.valueOf((int) r02.getLong(r64));
                        }
                        if (r02.isNull(i76)) {
                            i26 = r55;
                            valueOf12 = null;
                        } else {
                            i26 = r55;
                            valueOf12 = Integer.valueOf((int) r02.getLong(i76));
                        }
                        int i84 = r66;
                        String V30 = r02.isNull(i84) ? null : r02.V(i84);
                        int i85 = r67;
                        String V31 = r02.isNull(i85) ? null : r02.V(i85);
                        int i86 = r52;
                        int i87 = r68;
                        String V32 = r02.isNull(i87) ? null : r02.V(i87);
                        r68 = i87;
                        int i88 = r69;
                        String V33 = r02.isNull(i88) ? null : r02.V(i88);
                        r69 = i88;
                        int i89 = r70;
                        if (r02.isNull(i89)) {
                            i27 = i76;
                            i28 = i84;
                            valueOf13 = null;
                        } else {
                            i27 = i76;
                            i28 = i84;
                            valueOf13 = Integer.valueOf((int) r02.getLong(i89));
                        }
                        int i90 = r71;
                        if (r02.isNull(i90)) {
                            i29 = i85;
                            valueOf14 = null;
                        } else {
                            i29 = i85;
                            valueOf14 = Integer.valueOf((int) r02.getLong(i90));
                        }
                        int i91 = r72;
                        if (r02.isNull(i91)) {
                            i30 = r56;
                            valueOf15 = null;
                        } else {
                            i30 = r56;
                            valueOf15 = Integer.valueOf((int) r02.getLong(i91));
                        }
                        int i92 = r73;
                        if (r02.isNull(i92)) {
                            i31 = i90;
                            i32 = i91;
                        } else {
                            i31 = i90;
                            i32 = i91;
                            num3 = Integer.valueOf((int) r02.getLong(i92));
                        }
                        arrayList6.add(new ja.c(i77, i78, i79, i82, V23, V25, V24, V28, V29, i25, V27, V26, valueOf13, valueOf14, valueOf15, num3, valueOf11, valueOf12, V30, V31, V32, V33));
                        r52 = i86;
                        r66 = i28;
                        r70 = i89;
                        r53 = i80;
                        r65 = i27;
                        r67 = i29;
                        arrayList5 = arrayList6;
                        r71 = i31;
                        r56 = i30;
                        r72 = i32;
                        r54 = i81;
                        r73 = i92;
                        r55 = i26;
                    }
                    return arrayList5;
                } finally {
                }
            case 3:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT table_prediction_preview.* FROM table_prediction_preview WHERE publication != 0 ORDER BY startTime DESC");
                try {
                    int r74 = x.r(r02, "id");
                    int r75 = x.r(r02, PredictionTable.startTimeColumn);
                    int r76 = x.r(r02, PredictionTable.publicationColumn);
                    int r77 = x.r(r02, "type");
                    int r78 = x.r(r02, PredictionTable.statusColumn);
                    int r79 = x.r(r02, PredictionTable.imageBackgroundColumn);
                    int r80 = x.r(r02, PredictionTable.oddsColumn);
                    int r81 = x.r(r02, "purchased");
                    int r82 = x.r(r02, PredictionTable.forecastsColumn);
                    int r83 = x.r(r02, PredictionTable.arrayKindColumn);
                    int r84 = x.r(r02, PredictionTable.oddsForecastColumn);
                    int r85 = x.r(r02, PredictionTable.forecastColumn);
                    int r86 = x.r(r02, PredictionTable.teamHomeIdColumn);
                    int r87 = x.r(r02, PredictionTable.teamGuestIdColumn);
                    int r88 = x.r(r02, PredictionTable.teamHomeFlagColumn);
                    int r89 = x.r(r02, PredictionTable.teamGuestFlagColumn);
                    int r90 = x.r(r02, PredictionTable.teamHomeNameColumn);
                    int r91 = x.r(r02, PredictionTable.teamGuestNameColumn);
                    int r92 = x.r(r02, PredictionTable.scoreHomeColumn);
                    int r93 = x.r(r02, PredictionTable.scoreGuestColumn);
                    int r94 = x.r(r02, PredictionTable.scoreHomeExtraColumn);
                    int r95 = x.r(r02, PredictionTable.scoreGuestExtraColumn);
                    ArrayList arrayList7 = new ArrayList();
                    while (r02.n0()) {
                        int i93 = r86;
                        int i94 = r87;
                        int i95 = (int) r02.getLong(r74);
                        int i96 = (int) r02.getLong(r75);
                        int i97 = (int) r02.getLong(r76);
                        int i98 = r75;
                        int i99 = r76;
                        int i100 = (int) r02.getLong(r77);
                        Integer num4 = null;
                        String V34 = r02.isNull(r78) ? null : r02.V(r78);
                        String V35 = r02.isNull(r79) ? null : r02.V(r79);
                        String V36 = r02.isNull(r80) ? null : r02.V(r80);
                        int i101 = (int) r02.getLong(r81);
                        String V37 = r02.isNull(r82) ? null : r02.V(r82);
                        String V38 = r02.isNull(r83) ? null : r02.V(r83);
                        String V39 = r02.isNull(r84) ? null : r02.V(r84);
                        String V40 = r02.isNull(r85) ? null : r02.V(r85);
                        if (r02.isNull(i93)) {
                            i33 = r77;
                            i34 = r78;
                            valueOf16 = null;
                        } else {
                            i33 = r77;
                            i34 = r78;
                            valueOf16 = Integer.valueOf((int) r02.getLong(i93));
                        }
                        if (r02.isNull(i94)) {
                            i35 = i101;
                            i36 = i93;
                            valueOf17 = null;
                        } else {
                            i35 = i101;
                            i36 = i93;
                            valueOf17 = Integer.valueOf((int) r02.getLong(i94));
                        }
                        int i102 = r88;
                        String V41 = r02.isNull(i102) ? null : r02.V(i102);
                        int i103 = r89;
                        String V42 = r02.isNull(i103) ? null : r02.V(i103);
                        int i104 = r74;
                        int i105 = r90;
                        String V43 = r02.isNull(i105) ? null : r02.V(i105);
                        r90 = i105;
                        int i106 = r91;
                        String V44 = r02.isNull(i106) ? null : r02.V(i106);
                        r91 = i106;
                        int i107 = r92;
                        if (r02.isNull(i107)) {
                            i37 = i102;
                            i38 = i103;
                            valueOf18 = null;
                        } else {
                            i37 = i102;
                            i38 = i103;
                            valueOf18 = Integer.valueOf((int) r02.getLong(i107));
                        }
                        int i108 = r93;
                        if (r02.isNull(i108)) {
                            i39 = i94;
                            valueOf19 = null;
                        } else {
                            i39 = i94;
                            valueOf19 = Integer.valueOf((int) r02.getLong(i108));
                        }
                        int i109 = r94;
                        if (r02.isNull(i109)) {
                            i40 = i36;
                            valueOf20 = null;
                        } else {
                            i40 = i36;
                            valueOf20 = Integer.valueOf((int) r02.getLong(i109));
                        }
                        int i110 = r95;
                        if (r02.isNull(i110)) {
                            i41 = i108;
                            r94 = i109;
                        } else {
                            i41 = i108;
                            r94 = i109;
                            num4 = Integer.valueOf((int) r02.getLong(i110));
                        }
                        arrayList7.add(new ja.c(i95, i96, i97, i100, V34, V36, V35, V39, V40, i35, V38, V37, valueOf18, valueOf19, valueOf20, num4, valueOf16, valueOf17, V41, V42, V43, V44));
                        r74 = i104;
                        r88 = i37;
                        r89 = i38;
                        r92 = i107;
                        r95 = i110;
                        r75 = i98;
                        r86 = i40;
                        r77 = i33;
                        r87 = i39;
                        r76 = i99;
                        r93 = i41;
                        r78 = i34;
                    }
                    return arrayList7;
                } finally {
                }
            case 4:
                return Unit.f19194a;
            case 5:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 6:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 7:
                y1.d anim = (y1.d) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.f25540a = 0;
                anim.f25541b = 0;
                return Unit.f19194a;
            case 8:
                v0 popUpTo = (v0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f25642a = true;
                return Unit.f19194a;
            case 9:
                t1.c initializer = (t1.c) obj;
                Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
                return new s();
            case 10:
                return a(obj);
            case 11:
                return b(obj);
            case 12:
                return c(obj);
            case 13:
                return d(obj);
            case 14:
                return e(obj);
            case 15:
                return f(obj);
            default:
                j0 navOptions = (j0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.f25574b = true;
                return Unit.f19194a;
        }
    }
}
