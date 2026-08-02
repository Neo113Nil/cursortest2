package com.vk.superapp.miniapps.picker;

import com.vk.api.generated.apps.dto.AppsActionForMessengerDto;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.on00;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: PickerItem.kt */
/* loaded from: classes6.dex */
public abstract class PickerItem {
    public static final LinkedHashMap a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PickerItem.kt */
    public static final class ItemId {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemId[] $VALUES;
        public static final ItemId Banner;
        public static final ItemId BannerSeparator;
        public static final ItemId BlockOpenHeader;
        public static final ItemId BlockSendHeader;
        public static final ItemId Error;
        public static final ItemId Progress;
        private final int id;

        static {
            ItemId itemId = new ItemId("Banner", 0, -1);
            Banner = itemId;
            ItemId itemId2 = new ItemId("BannerSeparator", 1, -2);
            BannerSeparator = itemId2;
            ItemId itemId3 = new ItemId("BlockSendHeader", 2, -3);
            BlockSendHeader = itemId3;
            ItemId itemId4 = new ItemId("Progress", 3, -4);
            Progress = itemId4;
            ItemId itemId5 = new ItemId("Error", 4, -5);
            Error = itemId5;
            ItemId itemId6 = new ItemId("BlockOpenHeader", 5, -6);
            BlockOpenHeader = itemId6;
            ItemId[] itemIdArr = {itemId, itemId2, itemId3, itemId4, itemId5, itemId6};
            $VALUES = itemIdArr;
            $ENTRIES = new asp(itemIdArr);
        }

        public ItemId(String str, int i, int i2) {
            this.id = i2;
        }

        public static ItemId valueOf(String str) {
            return (ItemId) Enum.valueOf(ItemId.class, str);
        }

        public static ItemId[] values() {
            return (ItemId[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PickerItem.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType Banner;
        public static final ViewType Error;
        public static final ViewType Header;
        public static final ViewType ItemOpen;
        public static final ViewType ItemSend;
        public static final ViewType Progress;
        public static final ViewType Separator;
        private final int type;

        static {
            ViewType viewType = new ViewType("Banner", 0, R.layout.vk_onboarding_banner_holder);
            Banner = viewType;
            ViewType viewType2 = new ViewType("Header", 1, R.layout.vk_header_holder);
            Header = viewType2;
            ViewType viewType3 = new ViewType("ItemSend", 2, R.layout.vk_item_send_holder);
            ItemSend = viewType3;
            ViewType viewType4 = new ViewType("ItemOpen", 3, R.layout.vk_item_open_holder);
            ItemOpen = viewType4;
            ViewType viewType5 = new ViewType("Separator", 4, R.layout.vk_separator_holder);
            Separator = viewType5;
            ViewType viewType6 = new ViewType("Error", 5, R.layout.vk_picker_error_holder);
            Error = viewType6;
            ViewType viewType7 = new ViewType("Progress", 6, R.layout.vk_picker_progress);
            Progress = viewType7;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4, viewType5, viewType6, viewType7};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType(String str, int i, int i2) {
            this.type = i2;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }

        public final int h() {
            return this.type;
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class a extends PickerItem {
        public static final a b = new a();
        public static final int c = ItemId.Error.h();
        public static final int d = ViewType.Error.h();

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return c;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return d;
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class b extends PickerItem {
        public final int b;
        public final int c;
        public final int d = ViewType.Header.h();

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return this.b;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(id=");
            sb.append(this.b);
            sb.append(", title=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class c extends PickerItem {
        public final int b;
        public final WebImage c;
        public final String d;
        public final String e;
        public final WebApiApplication f;
        public final int g = ViewType.ItemOpen.h();

        public c(int i, WebImage webImage, String str, String str2, WebApiApplication webApiApplication) {
            this.b = i;
            this.c = webImage;
            this.d = str;
            this.e = str2;
            this.f = webApiApplication;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return this.b;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            return urd0.a(urd0.a(fw3.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e) + ((int) this.f.b);
        }

        public final String toString() {
            return "ItemOpen(id=" + this.b + ", icon=" + this.c + ", actionTitle=" + this.d + ", actionDescription=" + this.e + ", app=" + this.f + ')';
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class d extends PickerItem {
        public final int b;
        public final WebImage c;
        public final String d;
        public final String e;
        public final AppsActionForMessengerDto f;
        public final WebApiApplication g;
        public final int h = ViewType.ItemSend.h();

        public d(int i, WebImage webImage, String str, String str2, AppsActionForMessengerDto appsActionForMessengerDto, WebApiApplication webApiApplication) {
            this.b = i;
            this.c = webImage;
            this.d = str;
            this.e = str2;
            this.f = appsActionForMessengerDto;
            this.g = webApiApplication;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return this.b;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g);
        }

        public final int hashCode() {
            return ((this.f.hashCode() + urd0.a(urd0.a(fw3.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e)) * 31) + ((int) this.g.b);
        }

        public final String toString() {
            return "ItemSend(id=" + this.b + ", icon=" + this.c + ", actionTitle=" + this.d + ", actionDescription=" + this.e + ", action=" + this.f + ", app=" + this.g + ')';
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class e extends PickerItem {
        public final int b;
        public final int c;
        public final int d;
        public final int e = ItemId.Banner.h();
        public final int f = ViewType.Banner.h();

        public e(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return this.e;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnboardingBanner(titleId=");
            sb.append(this.b);
            sb.append(", subtitleId=");
            sb.append(this.c);
            sb.append(", iconId=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class f extends PickerItem {
        public static final f b = new f();
        public static final int c = ItemId.Progress.h();
        public static final int d = ViewType.Progress.h();

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return c;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return d;
        }
    }

    /* compiled from: PickerItem.kt */
    public static final class g extends PickerItem {
        public final int b;
        public final int c = ViewType.Separator.h();

        public g(int i) {
            this.b = i;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int a() {
            return this.b;
        }

        @Override // com.vk.superapp.miniapps.picker.PickerItem
        public final int b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Separator(id="), this.b, ')');
        }
    }

    static {
        ViewType[] values = ViewType.values();
        int e2 = on00.e(values.length);
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (ViewType viewType : values) {
            linkedHashMap.put(Integer.valueOf(viewType.h()), viewType);
        }
        a = linkedHashMap;
    }

    public abstract int a();

    public abstract int b();
}
