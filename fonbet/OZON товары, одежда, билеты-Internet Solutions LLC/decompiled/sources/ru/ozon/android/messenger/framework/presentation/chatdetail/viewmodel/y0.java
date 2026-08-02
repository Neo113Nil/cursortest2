package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;

/* loaded from: classes10.dex */
public abstract class y0 {

    public static final class a extends y0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90389a;

        /* renamed from: b, reason: collision with root package name */
        private final CustomBlockDTO f90390b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, String> f90391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String messageText, CustomBlockDTO customBlockDTO, Map<String, String> map) {
            super(0);
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            this.f90389a = messageText;
            this.f90390b = customBlockDTO;
            this.f90391c = map;
        }

        public final Map<String, String> a() {
            return this.f90391c;
        }

        public final CustomBlockDTO b() {
            return this.f90390b;
        }

        @NotNull
        public final String c() {
            return this.f90389a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f90389a, aVar.f90389a) && Intrinsics.d(this.f90390b, aVar.f90390b) && Intrinsics.d(this.f90391c, aVar.f90391c);
        }

        public final int hashCode() {
            int hashCode = this.f90389a.hashCode() * 31;
            CustomBlockDTO customBlockDTO = this.f90390b;
            int hashCode2 = (hashCode + (customBlockDTO == null ? 0 : customBlockDTO.hashCode())) * 31;
            Map<String, String> map = this.f90391c;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AiTextMessage(messageText=");
            sb2.append(this.f90389a);
            sb2.append(", customBlock=");
            sb2.append(this.f90390b);
            sb2.append(", context=");
            return T7.P.f(sb2, this.f90391c, ")");
        }
    }

    public static final class b extends y0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FileDTO f90392a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull FileDTO fileDTO) {
            super(0);
            Intrinsics.checkNotNullParameter(fileDTO, "fileDTO");
            this.f90392a = fileDTO;
        }

        @NotNull
        public final FileDTO a() {
            return this.f90392a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f90392a, ((b) obj).f90392a);
        }

        public final int hashCode() {
            return this.f90392a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "FileMessage(fileDTO=" + this.f90392a + ")";
        }
    }

    public static final class c extends y0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ImageDTO f90393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull ImageDTO imageDTO) {
            super(0);
            Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
            this.f90393a = imageDTO;
        }

        @NotNull
        public final ImageDTO a() {
            return this.f90393a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f90393a, ((c) obj).f90393a);
        }

        public final int hashCode() {
            return this.f90393a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ImageMessage(imageDTO=" + this.f90393a + ")";
        }
    }

    public static final class d extends y0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90394a;

        /* renamed from: b, reason: collision with root package name */
        private final CustomBlockDTO f90395b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String messageText, CustomBlockDTO customBlockDTO) {
            super(0);
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            this.f90394a = messageText;
            this.f90395b = customBlockDTO;
        }

        public final CustomBlockDTO a() {
            return this.f90395b;
        }

        @NotNull
        public final String b() {
            return this.f90394a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f90394a, dVar.f90394a) && Intrinsics.d(this.f90395b, dVar.f90395b);
        }

        public final int hashCode() {
            int hashCode = this.f90394a.hashCode() * 31;
            CustomBlockDTO customBlockDTO = this.f90395b;
            return hashCode + (customBlockDTO == null ? 0 : customBlockDTO.hashCode());
        }

        @NotNull
        public final String toString() {
            return "TextMessage(messageText=" + this.f90394a + ", customBlock=" + this.f90395b + ")";
        }
    }

    public y0(int i11) {
    }
}
