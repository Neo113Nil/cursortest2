package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.k13;
import defpackage.nh0;
import defpackage.sc5;
import defpackage.sub;
import defpackage.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
final class SignatureEnhancementBuilder {

    @NotNull
    private final Map<String, PredefinedFunctionEnhancementInfo> signatures = new LinkedHashMap();

    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class ClassEnhancementBuilder {

        @NotNull
        private final String className;
        final /* synthetic */ SignatureEnhancementBuilder this$0;

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String str) {
            str.getClass();
            this.this$0 = signatureEnhancementBuilder;
            this.className = str;
        }

        public final void function(@NotNull String str, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            str.getClass();
            function1.getClass();
            Map map = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, str);
            function1.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> build = functionEnhancementBuilder.build();
            map.put(build.a, build.b);
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public final class FunctionEnhancementBuilder {

            @NotNull
            private final String functionName;

            @NotNull
            private final List<Pair<String, TypeEnhancementInfo>> parameters;

            @NotNull
            private Pair<String, TypeEnhancementInfo> returnType;
            final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, String str) {
                str.getClass();
                this.this$0 = classEnhancementBuilder;
                this.functionName = str;
                this.parameters = new ArrayList();
                this.returnType = new Pair<>("V", null);
            }

            @NotNull
            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                String str = this.functionName;
                List<Pair<String, TypeEnhancementInfo>> list = this.parameters;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).a);
                }
                String signature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, (String) this.returnType.a));
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.returnType.b;
                List<Pair<String, TypeEnhancementInfo>> list2 = this.parameters;
                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).b);
                }
                return new Pair<>(signature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList2));
            }

            public final void parameter(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                str.getClass();
                javaTypeQualifiersArr.getClass();
                List<Pair<String, TypeEnhancementInfo>> list = this.parameters;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    nh0 nh0Var = new nh0(new z0(javaTypeQualifiersArr, 16), 2);
                    int c = sub.c(k13.r(nh0Var, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c >= 16 ? c : 16);
                    Iterator it = nh0Var.iterator();
                    while (true) {
                        sc5 sc5Var = (sc5) it;
                        if (!sc5Var.b.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.a), (JavaTypeQualifiers) indexedValue.b);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(new Pair<>(str, typeEnhancementInfo));
            }

            public final void returns(@NotNull String str, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                str.getClass();
                javaTypeQualifiersArr.getClass();
                nh0 nh0Var = new nh0(new z0(javaTypeQualifiersArr, 16), 2);
                int c = sub.c(k13.r(nh0Var, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(c >= 16 ? c : 16);
                Iterator it = nh0Var.iterator();
                while (true) {
                    sc5 sc5Var = (sc5) it;
                    if (!sc5Var.b.hasNext()) {
                        this.returnType = new Pair<>(str, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.a), (JavaTypeQualifiers) indexedValue.b);
                    }
                }
            }

            public final void returns(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                jvmPrimitiveType.getClass();
                String desc = jvmPrimitiveType.getDesc();
                desc.getClass();
                this.returnType = new Pair<>(desc, null);
            }
        }
    }
}
