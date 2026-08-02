package ru.ozon.app.android.returns.ui.presentation.flexImages;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "Ll20/c;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Simple", "Deletable", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI$Deletable;", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI$Simple;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ImageVI extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull ImageVI imageVI) {
            return null;
        }

        public static int getViewItemKey(@NotNull ImageVI imageVI) {
            return imageVI.hashCode();
        }
    }

    CommonControlSettings getCommon();

    @NotNull
    IconDTO getIcon();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI$Simple;", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Simple implements ImageVI {
        private final CommonControlSettings common;

        @NotNull
        private final IconDTO icon;
        private final long id;

        public Simple(long j11, @NotNull IconDTO icon, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.id = j11;
            this.icon = icon;
            this.common = commonControlSettings;
        }

        public boolean equals(Object other) {
            Simple simple = other instanceof Simple ? (Simple) other : null;
            return simple != null && simple.getId() == getId() && Intrinsics.d(simple.getCommon(), getCommon());
        }

        @Override // ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI
        public CommonControlSettings getCommon() {
            return this.common;
        }

        @Override // ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI
        @NotNull
        public IconDTO getIcon() {
            return this.icon;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(getId());
            int i11 = hashCode * 31;
            CommonControlSettings common = getCommon();
            return i11 + (common != null ? common.hashCode() : 0) + hashCode;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            IconDTO iconDTO = this.icon;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder b11 = D40.c.b("Simple(id=", j11, ", icon=", iconDTO);
            b11.append(", common=");
            b11.append(commonControlSettings);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ Simple(long j11, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, iconDTO, (i11 & 4) != 0 ? null : commonControlSettings);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI$Deletable;", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteButton", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Deletable implements ImageVI {
        private final CommonControlSettings common;
        private final IconButtonV3DTO deleteButton;

        @NotNull
        private final IconDTO icon;
        private final long id;

        public Deletable(long j11, @NotNull IconDTO icon, CommonControlSettings commonControlSettings, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.id = j11;
            this.icon = icon;
            this.common = commonControlSettings;
            this.deleteButton = iconButtonV3DTO;
        }

        public boolean equals(Object other) {
            Deletable deletable = other instanceof Deletable ? (Deletable) other : null;
            return deletable != null && deletable.getId() == getId() && Intrinsics.d(deletable.getCommon(), getCommon()) && Intrinsics.d(deletable.deleteButton, this.deleteButton);
        }

        @Override // ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI
        public CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconButtonV3DTO getDeleteButton() {
            return this.deleteButton;
        }

        @Override // ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI
        @NotNull
        public IconDTO getIcon() {
            return this.icon;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(getId());
            int i11 = hashCode * 31;
            CommonControlSettings common = getCommon();
            int hashCode2 = i11 + (common != null ? common.hashCode() : 0) + hashCode;
            int i12 = hashCode2 * 31;
            IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
            return i12 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0) + hashCode2;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            IconDTO iconDTO = this.icon;
            CommonControlSettings commonControlSettings = this.common;
            IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
            StringBuilder b11 = D40.c.b("Deletable(id=", j11, ", icon=", iconDTO);
            b11.append(", common=");
            b11.append(commonControlSettings);
            b11.append(", deleteButton=");
            b11.append(iconButtonV3DTO);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ Deletable(long j11, IconDTO iconDTO, CommonControlSettings commonControlSettings, IconButtonV3DTO iconButtonV3DTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, iconDTO, (i11 & 4) != 0 ? null : commonControlSettings, (i11 & 8) != 0 ? null : iconButtonV3DTO);
        }
    }
}
