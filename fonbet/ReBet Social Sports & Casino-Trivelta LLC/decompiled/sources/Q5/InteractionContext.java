package Q5;

import Zh.B;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import ei.C;
import ei.D;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002&\u0018BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\"\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\"\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010\"\u0012\u0004\b4\u0010%\u001a\u0004\b3\u0010\u001bR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010%\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"LQ5/n;", "", "", "eventName", "elementClasses", "elementId", "targetElementInnerText", "scrollDirection", "targetElement", "Lkotlinx/serialization/json/JsonObject;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LQ5/n;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "getEventName$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "getElementClasses", "getElementClasses$annotations", "c", "getElementId", "getElementId$annotations", W9.d.f13160a, "getTargetElementInnerText", "getTargetElementInnerText$annotations", com.bumptech.glide.gifdecoder.e.f29601m, "getScrollDirection", "getScrollDirection$annotations", "f", "getTargetElement", "getTargetElement$annotations", "g", "Lkotlinx/serialization/json/JsonObject;", "getAttributes", "()Lkotlinx/serialization/json/JsonObject;", "getAttributes$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInteractionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionContext.kt\ncom/coralogix/android/sdk/model/InteractionContext\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,59:1\n29#2,3:60\n*S KotlinDebug\n*F\n+ 1 InteractionContext.kt\ncom/coralogix/android/sdk/model/InteractionContext\n*L\n34#1:60,3\n*E\n"})
/* renamed from: Q5.n, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class InteractionContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String eventName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String elementClasses;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final String elementId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String targetElementInnerText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final String scrollDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final String targetElement;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final JsonObject attributes;

    /* renamed from: Q5.n$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9455a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f9455a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.model.InteractionContext", aVar, 7);
            j02.n("event_name", true);
            j02.n("element_classes", true);
            j02.n("element_id", true);
            j02.n("target_element_inner_text", true);
            j02.n("scroll_direction", true);
            j02.n("target_element", true);
            j02.n("attributes", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InteractionContext deserialize(ci.e decoder) {
            int i10;
            JsonObject jsonObject;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            boolean z10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            int i11 = 6;
            String str7 = null;
            if (c10.q()) {
                String s10 = c10.s(fVar, 0);
                Z0 z02 = Z0.f45341a;
                String str8 = (String) c10.C(fVar, 1, z02, null);
                String str9 = (String) c10.C(fVar, 2, z02, null);
                String str10 = (String) c10.C(fVar, 3, z02, null);
                String str11 = (String) c10.C(fVar, 4, z02, null);
                String s11 = c10.s(fVar, 5);
                str = s10;
                jsonObject = (JsonObject) c10.i(fVar, 6, D.f46068a, null);
                str6 = s11;
                str4 = str10;
                str5 = str11;
                str3 = str9;
                str2 = str8;
                i10 = 127;
            } else {
                boolean z11 = true;
                int i12 = 0;
                JsonObject jsonObject2 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (z11) {
                    int e10 = c10.e(fVar);
                    switch (e10) {
                        case -1:
                            z11 = false;
                        case 0:
                            z10 = true;
                            str7 = c10.s(fVar, 0);
                            i12 |= 1;
                            i11 = 6;
                        case 1:
                            z10 = true;
                            str12 = (String) c10.C(fVar, 1, Z0.f45341a, str12);
                            i12 |= 2;
                            i11 = 6;
                        case 2:
                            str13 = (String) c10.C(fVar, 2, Z0.f45341a, str13);
                            i12 |= 4;
                        case 3:
                            str14 = (String) c10.C(fVar, 3, Z0.f45341a, str14);
                            i12 |= 8;
                        case 4:
                            str15 = (String) c10.C(fVar, 4, Z0.f45341a, str15);
                            i12 |= 16;
                        case 5:
                            str16 = c10.s(fVar, 5);
                            i12 |= 32;
                        case 6:
                            jsonObject2 = (JsonObject) c10.i(fVar, i11, D.f46068a, jsonObject2);
                            i12 |= 64;
                        default:
                            throw new B(e10);
                    }
                }
                i10 = i12;
                jsonObject = jsonObject2;
                str = str7;
                str2 = str12;
                str3 = str13;
                str4 = str14;
                str5 = str15;
                str6 = str16;
            }
            c10.b(fVar);
            return new InteractionContext(i10, str, str2, str3, str4, str5, str6, jsonObject, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, InteractionContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            InteractionContext.a(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            Z0 z02 = Z0.f45341a;
            return new InterfaceC1901b[]{z02, AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(z02), z02, D.f46068a};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final bi.f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: Q5.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InteractionContext a(oh.g attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (!R4.a.g(attributes)) {
                return null;
            }
            String c10 = R4.a.c(attributes, "user-interaction-x");
            Double doubleOrNull = c10 != null ? StringsKt.toDoubleOrNull(c10) : null;
            String c11 = R4.a.c(attributes, "user-interaction-y");
            Double doubleOrNull2 = c11 != null ? StringsKt.toDoubleOrNull(c11) : null;
            C c12 = new C();
            if (doubleOrNull != null) {
                c12.b(C5444x.f55808b, ei.j.b(Double.valueOf(doubleOrNull.doubleValue())));
            }
            if (doubleOrNull2 != null) {
                c12.b("y", ei.j.b(Double.valueOf(doubleOrNull2.doubleValue())));
            }
            JsonObject a10 = c12.a();
            String c13 = R4.a.c(attributes, "user-interaction-type");
            String str = c13 == null ? "" : c13;
            String c14 = R4.a.c(attributes, "user-interaction-element-classes");
            String c15 = R4.a.c(attributes, "user-interaction-target-id");
            String c16 = R4.a.c(attributes, "user-interaction-inner-text");
            String c17 = R4.a.c(attributes, "user-interaction-direction");
            String c18 = R4.a.c(attributes, "user-interaction-target-element");
            return new InteractionContext(str, c14, c15, c16, c17, c18 == null ? "" : c18, a10);
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f9455a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ InteractionContext(int i10, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, U0 u02) {
        if ((i10 & 1) == 0) {
            this.eventName = "";
        } else {
            this.eventName = str;
        }
        if ((i10 & 2) == 0) {
            this.elementClasses = null;
        } else {
            this.elementClasses = str2;
        }
        if ((i10 & 4) == 0) {
            this.elementId = null;
        } else {
            this.elementId = str3;
        }
        if ((i10 & 8) == 0) {
            this.targetElementInnerText = null;
        } else {
            this.targetElementInnerText = str4;
        }
        if ((i10 & 16) == 0) {
            this.scrollDirection = null;
        } else {
            this.scrollDirection = str5;
        }
        if ((i10 & 32) == 0) {
            this.targetElement = "";
        } else {
            this.targetElement = str6;
        }
        if ((i10 & 64) == 0) {
            this.attributes = new C().a();
        } else {
            this.attributes = jsonObject;
        }
    }

    public static final /* synthetic */ void a(InteractionContext self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.eventName, "")) {
            output.G(serialDesc, 0, self.eventName);
        }
        if (output.m(serialDesc, 1) || self.elementClasses != null) {
            output.C(serialDesc, 1, Z0.f45341a, self.elementClasses);
        }
        if (output.m(serialDesc, 2) || self.elementId != null) {
            output.C(serialDesc, 2, Z0.f45341a, self.elementId);
        }
        if (output.m(serialDesc, 3) || self.targetElementInnerText != null) {
            output.C(serialDesc, 3, Z0.f45341a, self.targetElementInnerText);
        }
        if (output.m(serialDesc, 4) || self.scrollDirection != null) {
            output.C(serialDesc, 4, Z0.f45341a, self.scrollDirection);
        }
        if (output.m(serialDesc, 5) || !Intrinsics.areEqual(self.targetElement, "")) {
            output.G(serialDesc, 5, self.targetElement);
        }
        if (!output.m(serialDesc, 6) && Intrinsics.areEqual(self.attributes, new C().a())) {
            return;
        }
        output.B(serialDesc, 6, D.f46068a, self.attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionContext)) {
            return false;
        }
        InteractionContext interactionContext = (InteractionContext) other;
        return Intrinsics.areEqual(this.eventName, interactionContext.eventName) && Intrinsics.areEqual(this.elementClasses, interactionContext.elementClasses) && Intrinsics.areEqual(this.elementId, interactionContext.elementId) && Intrinsics.areEqual(this.targetElementInnerText, interactionContext.targetElementInnerText) && Intrinsics.areEqual(this.scrollDirection, interactionContext.scrollDirection) && Intrinsics.areEqual(this.targetElement, interactionContext.targetElement) && Intrinsics.areEqual(this.attributes, interactionContext.attributes);
    }

    public int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        String str = this.elementClasses;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.elementId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetElementInnerText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scrollDirection;
        return ((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.targetElement.hashCode()) * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "InteractionContext(eventName=" + this.eventName + ", elementClasses=" + this.elementClasses + ", elementId=" + this.elementId + ", targetElementInnerText=" + this.targetElementInnerText + ", scrollDirection=" + this.scrollDirection + ", targetElement=" + this.targetElement + ", attributes=" + this.attributes + ")";
    }

    public InteractionContext(String eventName, String str, String str2, String str3, String str4, String targetElement, JsonObject attributes) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(targetElement, "targetElement");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.eventName = eventName;
        this.elementClasses = str;
        this.elementId = str2;
        this.targetElementInnerText = str3;
        this.scrollDirection = str4;
        this.targetElement = targetElement;
        this.attributes = attributes;
    }
}
