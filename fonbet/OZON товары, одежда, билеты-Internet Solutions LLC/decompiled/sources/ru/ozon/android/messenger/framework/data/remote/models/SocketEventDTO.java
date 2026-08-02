package ru.ozon.android.messenger.framework.data.remote.models;

import B0.A0;
import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "", "Lru/ozon/android/messenger/framework/data/remote/models/a;", "type", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/a;)V", "Lru/ozon/android/messenger/framework/data/remote/models/a;", "getType", "()Lru/ozon/android/messenger/framework/data/remote/models/a;", "AddItem", "RemoveItem", "UpdateItem", "PinItems", "UserIsTyping", "ResetCache", "UpdateGlobalCounter", "RedirectToChatList", "Notify", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$Notify;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RedirectToChatList;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RemoveItem;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$ResetCache;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateGlobalCounter;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateItem;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UserIsTyping;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class SocketEventDTO {
    public static final int $stable = 0;

    @NotNull
    private final a type;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem$AddItemModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem$AddItemModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem$AddItemModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "AddItemModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AddItem extends SocketEventDTO {
        public static final int $stable = 8;

        @NotNull
        private final AddItemModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem$AddItemModel;", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "item", "Lru/ozon/android/messenger/framework/data/remote/models/b;", "place", "", "id", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/b;Ljava/lang/String;)V", "component1", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "component2", "()Lru/ozon/android/messenger/framework/data/remote/models/b;", "component3", "()Ljava/lang/String;", "copy", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/b;Ljava/lang/String;)Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$AddItem$AddItemModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "getItem", "Lru/ozon/android/messenger/framework/data/remote/models/b;", "getPlace", "Ljava/lang/String;", "getId", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddItemModel {
            public static final int $stable = 8;
            private final String id;

            @NotNull
            private final ItemDTO item;

            @NotNull
            private final b place;

            public AddItemModel(@NotNull ItemDTO item, @NotNull b place, String str) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(place, "place");
                this.item = item;
                this.place = place;
                this.id = str;
            }

            public static /* synthetic */ AddItemModel copy$default(AddItemModel addItemModel, ItemDTO itemDTO, b bVar, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    itemDTO = addItemModel.item;
                }
                if ((i11 & 2) != 0) {
                    bVar = addItemModel.place;
                }
                if ((i11 & 4) != 0) {
                    str = addItemModel.id;
                }
                return addItemModel.copy(itemDTO, bVar, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ItemDTO getItem() {
                return this.item;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final b getPlace() {
                return this.place;
            }

            /* renamed from: component3, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final AddItemModel copy(@NotNull ItemDTO item, @NotNull b place, String id2) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(place, "place");
                return new AddItemModel(item, place, id2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddItemModel)) {
                    return false;
                }
                AddItemModel addItemModel = (AddItemModel) other;
                return Intrinsics.d(this.item, addItemModel.item) && this.place == addItemModel.place && Intrinsics.d(this.id, addItemModel.id);
            }

            public final String getId() {
                return this.id;
            }

            @NotNull
            public final ItemDTO getItem() {
                return this.item;
            }

            @NotNull
            public final b getPlace() {
                return this.place;
            }

            public int hashCode() {
                int hashCode = (this.place.hashCode() + (this.item.hashCode() * 31)) * 31;
                String str = this.id;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                ItemDTO itemDTO = this.item;
                b bVar = this.place;
                String str = this.id;
                StringBuilder sb2 = new StringBuilder("AddItemModel(item=");
                sb2.append(itemDTO);
                sb2.append(", place=");
                sb2.append(bVar);
                sb2.append(", id=");
                return o0.c(sb2, str, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddItem(@NotNull AddItemModel model) {
            super(a.ADD_ITEM, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ AddItem copy$default(AddItem addItem, AddItemModel addItemModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                addItemModel = addItem.model;
            }
            return addItem.copy(addItemModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AddItemModel getModel() {
            return this.model;
        }

        @NotNull
        public final AddItem copy(@NotNull AddItemModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new AddItem(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddItem) && Intrinsics.d(this.model, ((AddItem) other).model);
        }

        @NotNull
        public final AddItemModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "AddItem(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$Notify;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$Notify$NotifyModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$Notify$NotifyModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$Notify$NotifyModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "NotifyModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Notify extends SocketEventDTO {
        public static final int $stable = 8;

        @NotNull
        private final NotifyModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$Notify$NotifyModel;", "", "item", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;)V", "getItem", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotifyModel {
            public static final int $stable = 8;

            @NotNull
            private final ItemDTO item;

            public NotifyModel(@NotNull ItemDTO item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            @NotNull
            public final ItemDTO getItem() {
                return this.item;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Notify(@NotNull NotifyModel model) {
            super(a.NOTIFY, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ Notify copy$default(Notify notify, NotifyModel notifyModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notifyModel = notify.model;
            }
            return notify.copy(notifyModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotifyModel getModel() {
            return this.model;
        }

        @NotNull
        public final Notify copy(@NotNull NotifyModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new Notify(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Notify) && Intrinsics.d(this.model, ((Notify) other).model);
        }

        @NotNull
        public final NotifyModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "Notify(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PinItemsModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PinItems extends SocketEventDTO {
        public static final int $stable = 8;

        @NotNull
        private final PinItemsModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;", "", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "items", "Lru/ozon/android/messenger/framework/data/remote/models/b;", "place", "", "id", "<init>", "(Ljava/util/List;Lru/ozon/android/messenger/framework/data/remote/models/b;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Lru/ozon/android/messenger/framework/data/remote/models/b;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lru/ozon/android/messenger/framework/data/remote/models/b;Ljava/lang/String;)Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$PinItems$PinItemsModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Lru/ozon/android/messenger/framework/data/remote/models/b;", "getPlace", "Ljava/lang/String;", "getId", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinItemsModel {
            public static final int $stable = 8;
            private final String id;

            @NotNull
            private final List<ItemDTO> items;

            @NotNull
            private final b place;

            public PinItemsModel(@NotNull List<ItemDTO> items, @NotNull b place, String str) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(place, "place");
                this.items = items;
                this.place = place;
                this.id = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PinItemsModel copy$default(PinItemsModel pinItemsModel, List list, b bVar, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = pinItemsModel.items;
                }
                if ((i11 & 2) != 0) {
                    bVar = pinItemsModel.place;
                }
                if ((i11 & 4) != 0) {
                    str = pinItemsModel.id;
                }
                return pinItemsModel.copy(list, bVar, str);
            }

            @NotNull
            public final List<ItemDTO> component1() {
                return this.items;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final b getPlace() {
                return this.place;
            }

            /* renamed from: component3, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final PinItemsModel copy(@NotNull List<ItemDTO> items, @NotNull b place, String id2) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(place, "place");
                return new PinItemsModel(items, place, id2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinItemsModel)) {
                    return false;
                }
                PinItemsModel pinItemsModel = (PinItemsModel) other;
                return Intrinsics.d(this.items, pinItemsModel.items) && this.place == pinItemsModel.place && Intrinsics.d(this.id, pinItemsModel.id);
            }

            public final String getId() {
                return this.id;
            }

            @NotNull
            public final List<ItemDTO> getItems() {
                return this.items;
            }

            @NotNull
            public final b getPlace() {
                return this.place;
            }

            public int hashCode() {
                int hashCode = (this.place.hashCode() + (this.items.hashCode() * 31)) * 31;
                String str = this.id;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                List<ItemDTO> list = this.items;
                b bVar = this.place;
                String str = this.id;
                StringBuilder sb2 = new StringBuilder("PinItemsModel(items=");
                sb2.append(list);
                sb2.append(", place=");
                sb2.append(bVar);
                sb2.append(", id=");
                return o0.c(sb2, str, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinItems(@NotNull PinItemsModel model) {
            super(a.PIN_ITEMS, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ PinItems copy$default(PinItems pinItems, PinItemsModel pinItemsModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                pinItemsModel = pinItems.model;
            }
            return pinItems.copy(pinItemsModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PinItemsModel getModel() {
            return this.model;
        }

        @NotNull
        public final PinItems copy(@NotNull PinItemsModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new PinItems(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PinItems) && Intrinsics.d(this.model, ((PinItems) other).model);
        }

        @NotNull
        public final PinItemsModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "PinItems(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RedirectToChatList;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RedirectToChatList$RedirectModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RedirectToChatList$RedirectModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RedirectToChatList$RedirectModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "RedirectModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class RedirectToChatList extends SocketEventDTO {
        public static final int $stable = 0;

        @NotNull
        private final RedirectModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RedirectToChatList$RedirectModel;", "", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RedirectModel {
            public static final int $stable = 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectToChatList(@NotNull RedirectModel model) {
            super(a.REDIRECT_TO_CHAT_LIST, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ RedirectToChatList copy$default(RedirectToChatList redirectToChatList, RedirectModel redirectModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                redirectModel = redirectToChatList.model;
            }
            return redirectToChatList.copy(redirectModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RedirectModel getModel() {
            return this.model;
        }

        @NotNull
        public final RedirectToChatList copy(@NotNull RedirectModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new RedirectToChatList(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RedirectToChatList) && Intrinsics.d(this.model, ((RedirectToChatList) other).model);
        }

        @NotNull
        public final RedirectModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "RedirectToChatList(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RemoveItem;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RemoveItem$RemoveItemModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RemoveItem$RemoveItemModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RemoveItem$RemoveItemModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "RemoveItemModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class RemoveItem extends SocketEventDTO {
        public static final int $stable = 0;

        @NotNull
        private final RemoveItemModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$RemoveItem$RemoveItemModel;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RemoveItemModel {
            public static final int $stable = 0;

            @NotNull
            private final String id;

            public RemoveItemModel(@NotNull String id2) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
            }

            public static /* synthetic */ RemoveItemModel copy$default(RemoveItemModel removeItemModel, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = removeItemModel.id;
                }
                return removeItemModel.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final RemoveItemModel copy(@NotNull String id2) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new RemoveItemModel(id2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RemoveItemModel) && Intrinsics.d(this.id, ((RemoveItemModel) other).id);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("RemoveItemModel(id=", this.id, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveItem(@NotNull RemoveItemModel model) {
            super(a.REMOVE_ITEM, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ RemoveItem copy$default(RemoveItem removeItem, RemoveItemModel removeItemModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                removeItemModel = removeItem.model;
            }
            return removeItem.copy(removeItemModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RemoveItemModel getModel() {
            return this.model;
        }

        @NotNull
        public final RemoveItem copy(@NotNull RemoveItemModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new RemoveItem(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveItem) && Intrinsics.d(this.model, ((RemoveItem) other).model);
        }

        @NotNull
        public final RemoveItemModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoveItem(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$ResetCache;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$ResetCache$ResetModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$ResetCache$ResetModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$ResetCache$ResetModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ResetModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ResetCache extends SocketEventDTO {
        public static final int $stable = 0;

        @NotNull
        private final ResetModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$ResetCache$ResetModel;", "", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ResetModel {
            public static final int $stable = 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetCache(@NotNull ResetModel model) {
            super(a.RESET_CACHE, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ ResetCache copy$default(ResetCache resetCache, ResetModel resetModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                resetModel = resetCache.model;
            }
            return resetCache.copy(resetModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ResetModel getModel() {
            return this.model;
        }

        @NotNull
        public final ResetCache copy(@NotNull ResetModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new ResetCache(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResetCache) && Intrinsics.d(this.model, ((ResetCache) other).model);
        }

        @NotNull
        public final ResetModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "ResetCache(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateGlobalCounter;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateGlobalCounter$UpdateGlobalCounterModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateGlobalCounter$UpdateGlobalCounterModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateGlobalCounter$UpdateGlobalCounterModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "UpdateGlobalCounterModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class UpdateGlobalCounter extends SocketEventDTO {
        public static final int $stable = 0;

        @NotNull
        private final UpdateGlobalCounterModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateGlobalCounter$UpdateGlobalCounterModel;", "", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UpdateGlobalCounterModel {
            public static final int $stable = 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateGlobalCounter(@NotNull UpdateGlobalCounterModel model) {
            super(a.UPDATE_GLOBAL_COUNTER, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ UpdateGlobalCounter copy$default(UpdateGlobalCounter updateGlobalCounter, UpdateGlobalCounterModel updateGlobalCounterModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                updateGlobalCounterModel = updateGlobalCounter.model;
            }
            return updateGlobalCounter.copy(updateGlobalCounterModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final UpdateGlobalCounterModel getModel() {
            return this.model;
        }

        @NotNull
        public final UpdateGlobalCounter copy(@NotNull UpdateGlobalCounterModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new UpdateGlobalCounter(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateGlobalCounter) && Intrinsics.d(this.model, ((UpdateGlobalCounter) other).model);
        }

        @NotNull
        public final UpdateGlobalCounterModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateGlobalCounter(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateItem;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateItem$UpdateItemModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateItem$UpdateItemModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateItem$UpdateItemModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "UpdateItemModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class UpdateItem extends SocketEventDTO {
        public static final int $stable = 8;

        @NotNull
        private final UpdateItemModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UpdateItem$UpdateItemModel;", "", "item", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;)V", "getItem", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpdateItemModel {
            public static final int $stable = 8;

            @NotNull
            private final ItemDTO item;

            public UpdateItemModel(@NotNull ItemDTO item) {
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            public static /* synthetic */ UpdateItemModel copy$default(UpdateItemModel updateItemModel, ItemDTO itemDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    itemDTO = updateItemModel.item;
                }
                return updateItemModel.copy(itemDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ItemDTO getItem() {
                return this.item;
            }

            @NotNull
            public final UpdateItemModel copy(@NotNull ItemDTO item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return new UpdateItemModel(item);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateItemModel) && Intrinsics.d(this.item, ((UpdateItemModel) other).item);
            }

            @NotNull
            public final ItemDTO getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            @NotNull
            public String toString() {
                return "UpdateItemModel(item=" + this.item + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateItem(@NotNull UpdateItemModel model) {
            super(a.UPDATE_ITEM, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ UpdateItem copy$default(UpdateItem updateItem, UpdateItemModel updateItemModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                updateItemModel = updateItem.model;
            }
            return updateItem.copy(updateItemModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final UpdateItemModel getModel() {
            return this.model;
        }

        @NotNull
        public final UpdateItem copy(@NotNull UpdateItemModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new UpdateItem(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateItem) && Intrinsics.d(this.model, ((UpdateItem) other).model);
        }

        @NotNull
        public final UpdateItemModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateItem(model=" + this.model + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UserIsTyping;", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO;", "model", "Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UserIsTyping$UserIsTypingModel;", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UserIsTyping$UserIsTypingModel;)V", "getModel", "()Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UserIsTyping$UserIsTypingModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "UserIsTypingModel", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class UserIsTyping extends SocketEventDTO {
        public static final int $stable = 0;

        @NotNull
        private final UserIsTypingModel model;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/SocketEventDTO$UserIsTyping$UserIsTypingModel;", "", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UserIsTypingModel {
            public static final int $stable = 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserIsTyping(@NotNull UserIsTypingModel model) {
            super(a.USER_IS_TYPING, null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public static /* synthetic */ UserIsTyping copy$default(UserIsTyping userIsTyping, UserIsTypingModel userIsTypingModel, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                userIsTypingModel = userIsTyping.model;
            }
            return userIsTyping.copy(userIsTypingModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final UserIsTypingModel getModel() {
            return this.model;
        }

        @NotNull
        public final UserIsTyping copy(@NotNull UserIsTypingModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new UserIsTyping(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserIsTyping) && Intrinsics.d(this.model, ((UserIsTyping) other).model);
        }

        @NotNull
        public final UserIsTypingModel getModel() {
            return this.model;
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserIsTyping(model=" + this.model + ")";
        }
    }

    public /* synthetic */ SocketEventDTO(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @NotNull
    public final a getType() {
        return this.type;
    }

    private SocketEventDTO(a aVar) {
        this.type = aVar;
    }
}
