package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import Sc.s;
import Sh.b;
import Wc.a;
import android.content.Context;
import android.graphics.BitmapFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$prepareWidgets$1", f = "WidgetImagePlaceholderAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class WidgetImagePlaceholderAdapter$prepareWidgets$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $folderSku;
    int label;
    final /* synthetic */ WidgetImagePlaceholderAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetImagePlaceholderAdapter$prepareWidgets$1(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, Context context, String str, d<? super WidgetImagePlaceholderAdapter$prepareWidgets$1> dVar) {
        super(2, dVar);
        this.this$0 = widgetImagePlaceholderAdapter;
        this.$context = context;
        this.$folderSku = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new WidgetImagePlaceholderAdapter$prepareWidgets$1(this.this$0, this.$context, this.$folderSku, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2, r3) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2, r3) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        r2 = r24.this$0.oldWidgetsObject;
        r2.clear();
        r2 = r24.this$0.bitmapImages;
        r2.clear();
        r2 = r24.this$0.prepareViews;
        r2.clear();
        r2 = r24.this$0.darkBitmapImages;
        r2.clear();
        r2 = r24.this$0.prepareIds;
        r2.clear();
        r2 = r24.this$0.mapState;
        r2.clear();
        r24.this$0.removeDirectoryAndFiles(r24.$context, r24.$folderSku);
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Float f7;
        Integer num;
        Float textSizeSP;
        Integer windowWidth;
        File[] listFiles;
        File[] listFiles2;
        Map map;
        Map map2;
        File[] listFiles3;
        File[] listFiles4;
        Float textSizeSP2;
        String str;
        Integer windowWidth2;
        Map map3;
        JsonParser jsonParser;
        Map map4;
        Integer num2;
        Integer windowWidth3;
        AtomicBoolean atomicBoolean;
        Float f11;
        Float textSizeSP3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        f7 = this.this$0.lastTextSizeSP;
        if (f7 != null) {
            f11 = this.this$0.lastTextSizeSP;
            textSizeSP3 = this.this$0.getTextSizeSP();
        }
        num = this.this$0.lastWindowWidth;
        if (num != null) {
            num2 = this.this$0.lastWindowWidth;
            windowWidth3 = this.this$0.getWindowWidth();
        }
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter = this.this$0;
        textSizeSP = widgetImagePlaceholderAdapter.getTextSizeSP();
        widgetImagePlaceholderAdapter.lastTextSizeSP = textSizeSP;
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter2 = this.this$0;
        windowWidth = widgetImagePlaceholderAdapter2.getWindowWidth();
        widgetImagePlaceholderAdapter2.lastWindowWidth = windowWidth;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str2 = "PdpWidgetJsonStorage/";
        File file = new File(this.$context.getFilesDir(), Nk.a.b("PdpWidgetJsonStorage/", this.$folderSku));
        if (file.exists() && file.isDirectory() && (listFiles3 = file.listFiles()) != null) {
            Context context = this.$context;
            String str3 = this.$folderSku;
            WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter3 = this.this$0;
            int length = listFiles3.length;
            int i11 = 0;
            while (i11 < length) {
                String name = listFiles3[i11].getName();
                File file2 = new File(context.getFilesDir(), b.c(str2, str3, "/", name));
                if (file2.exists() && file2.isDirectory() && (listFiles4 = file2.listFiles()) != null) {
                    int length2 = listFiles4.length;
                    int i12 = 0;
                    while (i12 < length2) {
                        File file3 = listFiles4[i12];
                        File[] fileArr = listFiles4;
                        String name2 = file3.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        File[] fileArr2 = listFiles3;
                        Context context2 = context;
                        int i13 = length2;
                        List m11 = h.m(name2, new String[]{"-"}, 0, 6);
                        String str4 = (String) C7714v.Q(1, m11);
                        Float f12 = str4 != null ? new Float(Float.parseFloat(str4)) : null;
                        textSizeSP2 = widgetImagePlaceholderAdapter3.getTextSizeSP();
                        if (Intrinsics.c(f12, textSizeSP2)) {
                            String str5 = (String) C7714v.Q(2, m11);
                            Integer num3 = str5 != null ? new Integer(Integer.parseInt(str5)) : null;
                            windowWidth2 = widgetImagePlaceholderAdapter3.getWindowWidth();
                            if (Intrinsics.d(num3, windowWidth2)) {
                                WidgetImagePlaceholderMapper widgetImagePlaceholderMapper = WidgetImagePlaceholderMapper.INSTANCE;
                                Intrinsics.f(name);
                                Class<? extends BasePlaceholderWidgetObject> map$configurators_prodGoogleAllVendorsRelease = widgetImagePlaceholderMapper.map$configurators_prodGoogleAllVendorsRelease(name);
                                if (map$configurators_prodGoogleAllVendorsRelease != null) {
                                    map3 = widgetImagePlaceholderAdapter3.oldWidgetsObject;
                                    Collection collection = (List) map3.get(name);
                                    if (collection == null) {
                                        collection = new ArrayList();
                                    }
                                    jsonParser = widgetImagePlaceholderAdapter3.jsonDeserializer;
                                    str = str2;
                                    collection.add(((BasePlaceholderWidgetObject) jsonParser.fromJson(bd.h.l(file3), (Class) map$configurators_prodGoogleAllVendorsRelease)).copyExcludingAnalytics());
                                    map4 = widgetImagePlaceholderAdapter3.oldWidgetsObject;
                                    map4.put(name, collection);
                                } else {
                                    str = str2;
                                }
                                i12++;
                                listFiles4 = fileArr;
                                listFiles3 = fileArr2;
                                context = context2;
                                length2 = i13;
                                str2 = str;
                            }
                        }
                        str = str2;
                        linkedHashSet.add(m11.get(0));
                        i12++;
                        listFiles4 = fileArr;
                        listFiles3 = fileArr2;
                        context = context2;
                        length2 = i13;
                        str2 = str;
                    }
                }
                i11++;
                listFiles3 = listFiles3;
                context = context;
                str2 = str2;
            }
        }
        String str6 = "PdpWidgetBitmapStorage/";
        File file4 = new File(this.$context.getFilesDir(), Nk.a.b("PdpWidgetBitmapStorage/", this.$folderSku));
        if (file4.exists() && file4.isDirectory() && (listFiles = file4.listFiles()) != null) {
            Context context3 = this.$context;
            String str7 = this.$folderSku;
            WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter4 = this.this$0;
            int length3 = listFiles.length;
            int i14 = 0;
            while (i14 < length3) {
                String name3 = listFiles[i14].getName();
                File file5 = new File(context3.getFilesDir(), b.c(str6, str7, "/", name3));
                if (file5.exists() && file5.isDirectory() && (listFiles2 = file5.listFiles()) != null) {
                    int length4 = listFiles2.length;
                    int i15 = 0;
                    while (i15 < length4) {
                        File file6 = listFiles2[i15];
                        File[] fileArr3 = listFiles;
                        String name4 = file6.getName();
                        Context context4 = context3;
                        String name5 = file6.getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                        String str8 = str7;
                        String str9 = str6;
                        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter5 = widgetImagePlaceholderAdapter4;
                        List m12 = h.m(name5, new String[]{"-"}, 0, 6);
                        if (!linkedHashSet.contains(m12.get(0))) {
                            if (Intrinsics.d(C7714v.Z(m12), "dark")) {
                                String str10 = (String) C7714v.M(m12);
                                if (str10 != null) {
                                    map2 = widgetImagePlaceholderAdapter5.darkBitmapImages;
                                    map2.put(name3, U.i(new Pair(str10, BitmapFactory.decodeFile(file6.getAbsolutePath()))));
                                }
                            } else {
                                map = widgetImagePlaceholderAdapter5.bitmapImages;
                                map.put(name3, U.i(new Pair(name4, BitmapFactory.decodeFile(file6.getAbsolutePath()))));
                            }
                        }
                        i15++;
                        widgetImagePlaceholderAdapter4 = widgetImagePlaceholderAdapter5;
                        listFiles = fileArr3;
                        context3 = context4;
                        str7 = str8;
                        str6 = str9;
                    }
                }
                i14++;
                widgetImagePlaceholderAdapter4 = widgetImagePlaceholderAdapter4;
                listFiles = listFiles;
                context3 = context3;
                str7 = str7;
                str6 = str6;
            }
        }
        if (!linkedHashSet.isEmpty()) {
            this.this$0.removeDirectoryAndFiles(this.$context, this.$folderSku);
        }
        atomicBoolean = this.this$0.isWidgetsPrepared;
        atomicBoolean.set(true);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((WidgetImagePlaceholderAdapter$prepareWidgets$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
