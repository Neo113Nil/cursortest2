package com.vk.movika.sdk.android.defaultplayer.view.timeline;

import android.view.View;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.subjects.d;
import java.util.Iterator;
import java.util.List;
import xsna.asu0;
import xsna.cau0;
import xsna.fh5;
import xsna.fl6;
import xsna.fpf0;
import xsna.gg1;
import xsna.gzs;
import xsna.k7m;
import xsna.kh1;
import xsna.l7s;
import xsna.m33;
import xsna.m7m;
import xsna.r46;
import xsna.rul;
import xsna.s3q0;
import xsna.wfk0;
import xsna.xa4;
import xsna.y6p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [xsna.j8i, xsna.xwb$a] */
    @Override // xsna.gzs
    public final Object invoke() {
        View b;
        Long init$lambda$5;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                TimeoutView timeoutView = (TimeoutView) obj;
                Iterator<T> it = timeoutView.d.iterator();
                while (it.hasNext()) {
                    ((gzs) it.next()).invoke();
                }
                timeoutView.d.clear();
                return s3q0.a;
            case 1:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 2:
                ((gg1) obj).p.b(new i.k(kh1.c.a));
                return s3q0.a;
            case 3:
                int i2 = ArchiveFragment.e0;
                return ((NewsFeedBridgeComponent) ((k7m) m7m.f((ArchiveFragment) obj)).a(fpf0.a(NewsFeedBridgeComponent.class))).Ad();
            case 4:
                wfk0 wfk0Var = ((fh5) obj).G;
                if (wfk0Var != null && (b = wfk0Var.b()) != null && b.getId() == R.id.feed_carousel_product_sound_control) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return xa4.L(((r46) obj).b);
            case 6:
                List<BaseAvatarPickerActivity.ImageSourceAction> list = BaseAvatarPickerActivity.f;
                ((BaseAvatarPickerActivity) obj).O1();
                return s3q0.a;
            case 7:
                return m33.a(R.drawable.bg_story_glow, (l7s) obj);
            case 8:
                rul rulVar = (rul) obj;
                final d N0 = d.N0();
                ((EduCommonComponent) ((k7m) m7m.f(new fl6.g())).mo408a(fpf0.a(EduCommonComponent.class))).g2();
                if (rulVar.j()) {
                    cau0 cau0Var = rulVar.a.r().h;
                }
                rulVar.h(q.T(y6p.a.a).r0(asu0.a.c()).subscribe(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b7: INVOKE 
                      (r3v9 'rulVar' xsna.rul)
                      (wrap:io.reactivex.rxjava3.disposables.c:0x01b3: INVOKE 
                      (wrap:io.reactivex.rxjava3.internal.operators.observable.l2:0x0195: INVOKE 
                      (wrap:io.reactivex.rxjava3.internal.operators.observable.g1:0x018b: INVOKE (wrap:xsna.y6p$a:0x0189: SGET  A[WRAPPED] (LINE:394) xsna.y6p.a.a xsna.y6p$a) STATIC call: io.reactivex.rxjava3.core.q.T(java.lang.Object):io.reactivex.rxjava3.internal.operators.observable.g1 A[MD:(java.lang.Object):io.reactivex.rxjava3.internal.operators.observable.g1 (m), WRAPPED] (LINE:396))
                      (wrap:io.reactivex.rxjava3.core.w:0x0191: INVOKE (wrap:xsna.asu0:0x018f: SGET  A[WRAPPED] (LINE:400) xsna.asu0.a xsna.asu0) VIRTUAL call: xsna.asu0.c():io.reactivex.rxjava3.core.w A[MD:():io.reactivex.rxjava3.core.w (m), WRAPPED] (LINE:402))
                     VIRTUAL call: io.reactivex.rxjava3.core.q.r0(io.reactivex.rxjava3.core.w):io.reactivex.rxjava3.internal.operators.observable.l2 A[MD:(io.reactivex.rxjava3.core.w):io.reactivex.rxjava3.internal.operators.observable.l2 (m), WRAPPED] (LINE:406))
                      (wrap:io.reactivex.rxjava3.functions.f:0x019b: CONSTRUCTOR (r0v24 'N0' io.reactivex.rxjava3.subjects.d A[DONT_INLINE]) A[MD:(io.reactivex.rxjava3.subjects.d<xsna.y6p>):void (m), WRAPPED] (LINE:412) call: xsna.fl6.e.<init>(io.reactivex.rxjava3.subjects.d):void type: CONSTRUCTOR)
                      (wrap:xsna.f50:0x01b0: CONSTRUCTOR 
                      (wrap:xsna.fl6$f:0x01aa: CONSTRUCTOR 
                      (1 int)
                      (wrap:com.vk.log.L:0x01a0: SGET  A[WRAPPED] (LINE:417) com.vk.log.L.a com.vk.log.L)
                      (wrap:java.lang.Class:0x01a6: CONST_CLASS  A[WRAPPED] (LINE:423) com.vk.log.L.class)
                      (wrap:java.lang.String:SGET  A[WRAPPED] ru.ok.android.utils.Logger.METHOD_E java.lang.String)
                      ("e(Ljava/lang/Throwable;)V")
                      (0 int)
                     A[MD:(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void (m), WRAPPED] (LINE:427) call: xsna.fl6.f.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void type: CONSTRUCTOR)
                      (6 int)
                     A[MD:(java.lang.Object, int):void (m), WRAPPED] (LINE:433) call: xsna.f50.<init>(java.lang.Object, int):void type: CONSTRUCTOR)
                     VIRTUAL call: io.reactivex.rxjava3.core.q.subscribe(io.reactivex.rxjava3.functions.f, io.reactivex.rxjava3.functions.f):io.reactivex.rxjava3.disposables.c A[MD:(io.reactivex.rxjava3.functions.f<? super T>, io.reactivex.rxjava3.functions.f<? super java.lang.Throwable>):io.reactivex.rxjava3.disposables.c (m), WRAPPED] (LINE:436))
                     VIRTUAL call: xsna.fl6.h(io.reactivex.rxjava3.disposables.c):void A[MD:(io.reactivex.rxjava3.disposables.c):void (m)] (LINE:440) in method: com.vk.movika.sdk.android.defaultplayer.view.timeline.a.invoke():java.lang.Object, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: xsna.fl6, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    Method dump skipped, instructions count: 646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vk.movika.sdk.android.defaultplayer.view.timeline.a.invoke():java.lang.Object");
            }
        }
