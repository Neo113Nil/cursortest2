package com.yandex.mapkit.search;

import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.Image;
import com.yandex.mapkit.search.Feature;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class BusinessFilter implements Serializable {
    private Boolean disabled;
    private boolean disabled__is_initialized;
    private Image iconAfterDark;
    private boolean iconAfterDark__is_initialized;
    private Image iconAfterLight;
    private boolean iconAfterLight__is_initialized;
    private Image iconDark;
    private boolean iconDark__is_initialized;
    private Image iconLight;
    private boolean iconLight__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f60737id;
    private boolean id__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private Boolean singleSelect;
    private boolean singleSelect__is_initialized;
    private Values values;
    private boolean values__is_initialized;

    public static class Values implements Serializable {
        private List<BooleanValue> booleans;
        private DateValue date;
        private List<EnumValue> enums;
        private RangeValue range;

        @NonNull
        public static Values fromBooleans(@NonNull List<BooleanValue> list) {
            if (list == null) {
                throw new IllegalArgumentException("Variant value \"booleans\" cannot be null");
            }
            Values values = new Values();
            values.booleans = list;
            return values;
        }

        @NonNull
        public static Values fromDate(@NonNull DateValue dateValue) {
            if (dateValue == null) {
                throw new IllegalArgumentException("Variant value \"date\" cannot be null");
            }
            Values values = new Values();
            values.date = dateValue;
            return values;
        }

        @NonNull
        public static Values fromEnums(@NonNull List<EnumValue> list) {
            if (list == null) {
                throw new IllegalArgumentException("Variant value \"enums\" cannot be null");
            }
            Values values = new Values();
            values.enums = list;
            return values;
        }

        @NonNull
        public static Values fromRange(@NonNull RangeValue rangeValue) {
            if (rangeValue == null) {
                throw new IllegalArgumentException("Variant value \"range\" cannot be null");
            }
            Values values = new Values();
            values.range = rangeValue;
            return values;
        }

        public List<BooleanValue> getBooleans() {
            return this.booleans;
        }

        public DateValue getDate() {
            return this.date;
        }

        public List<EnumValue> getEnums() {
            return this.enums;
        }

        public RangeValue getRange() {
            return this.range;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.booleans = G.d(BooleanValue.class, archive, this.booleans, true);
            this.enums = G.d(EnumValue.class, archive, this.enums, true);
            this.range = (RangeValue) archive.add((Archive) this.range, true, (Class<Archive>) RangeValue.class);
            this.date = (DateValue) archive.add((Archive) this.date, true, (Class<Archive>) DateValue.class);
        }
    }

    public BusinessFilter() {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.disabled__is_initialized = false;
        this.iconLight__is_initialized = false;
        this.iconDark__is_initialized = false;
        this.iconAfterLight__is_initialized = false;
        this.iconAfterDark__is_initialized = false;
        this.singleSelect__is_initialized = false;
        this.values__is_initialized = false;
    }

    private native Boolean getDisabled__Native();

    private native Image getIconAfterDark__Native();

    private native Image getIconAfterLight__Native();

    private native Image getIconDark__Native();

    private native Image getIconLight__Native();

    private native String getId__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessFilter";
    }

    private native Boolean getSingleSelect__Native();

    private native Values getValues__Native();

    private native NativeObject init(String str, String str2, Boolean bool, Image image, Image image2, Image image3, Image image4, Boolean bool2, Values values);

    public synchronized Boolean getDisabled() {
        try {
            if (!this.disabled__is_initialized) {
                this.disabled = getDisabled__Native();
                this.disabled__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.disabled;
    }

    public synchronized Image getIconAfterDark() {
        try {
            if (!this.iconAfterDark__is_initialized) {
                this.iconAfterDark = getIconAfterDark__Native();
                this.iconAfterDark__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconAfterDark;
    }

    public synchronized Image getIconAfterLight() {
        try {
            if (!this.iconAfterLight__is_initialized) {
                this.iconAfterLight = getIconAfterLight__Native();
                this.iconAfterLight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconAfterLight;
    }

    public synchronized Image getIconDark() {
        try {
            if (!this.iconDark__is_initialized) {
                this.iconDark = getIconDark__Native();
                this.iconDark__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconDark;
    }

    public synchronized Image getIconLight() {
        try {
            if (!this.iconLight__is_initialized) {
                this.iconLight = getIconLight__Native();
                this.iconLight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconLight;
    }

    @NonNull
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f60737id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60737id;
    }

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.name;
    }

    public synchronized Boolean getSingleSelect() {
        try {
            if (!this.singleSelect__is_initialized) {
                this.singleSelect = getSingleSelect__Native();
                this.singleSelect__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.singleSelect;
    }

    @NonNull
    public synchronized Values getValues() {
        try {
            if (!this.values__is_initialized) {
                this.values = getValues__Native();
                this.values__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getName(), true);
            archive.add(getDisabled(), true);
            archive.add((Archive) getIconLight(), true, (Class<Archive>) Image.class);
            archive.add((Archive) getIconDark(), true, (Class<Archive>) Image.class);
            archive.add((Archive) getIconAfterLight(), true, (Class<Archive>) Image.class);
            archive.add((Archive) getIconAfterDark(), true, (Class<Archive>) Image.class);
            archive.add(getSingleSelect(), true);
            archive.add((Archive) getValues(), false, (Class<Archive>) Values.class);
            return;
        }
        this.f60737id = archive.add(this.f60737id, false);
        this.id__is_initialized = true;
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        this.disabled = archive.add(this.disabled, true);
        this.disabled__is_initialized = true;
        this.iconLight = (Image) archive.add((Archive) this.iconLight, true, (Class<Archive>) Image.class);
        this.iconLight__is_initialized = true;
        this.iconDark = (Image) archive.add((Archive) this.iconDark, true, (Class<Archive>) Image.class);
        this.iconDark__is_initialized = true;
        this.iconAfterLight = (Image) archive.add((Archive) this.iconAfterLight, true, (Class<Archive>) Image.class);
        this.iconAfterLight__is_initialized = true;
        this.iconAfterDark = (Image) archive.add((Archive) this.iconAfterDark, true, (Class<Archive>) Image.class);
        this.iconAfterDark__is_initialized = true;
        this.singleSelect = archive.add(this.singleSelect, true);
        this.singleSelect__is_initialized = true;
        Values values = (Values) archive.add((Archive) this.values, false, (Class<Archive>) Values.class);
        this.values = values;
        this.values__is_initialized = true;
        this.nativeObject = init(this.f60737id, this.name, this.disabled, this.iconLight, this.iconDark, this.iconAfterLight, this.iconAfterDark, this.singleSelect, values);
    }

    public static class DateValue implements Serializable {
        private int reserved;

        public DateValue(int i11) {
            this.reserved = i11;
        }

        public int getReserved() {
            return this.reserved;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.reserved = archive.add(this.reserved);
        }

        public DateValue() {
        }
    }

    public static class BooleanValue implements Serializable {
        private Boolean selected;
        private boolean value;

        public BooleanValue(boolean z11, Boolean bool) {
            this.value = z11;
            this.selected = bool;
        }

        public Boolean getSelected() {
            return this.selected;
        }

        public boolean getValue() {
            return this.value;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.value = archive.add(this.value);
            this.selected = archive.add(this.selected, true);
        }

        public BooleanValue() {
        }
    }

    public static class RangeValue implements Serializable {
        private double from;
        private double to;

        public RangeValue(double d11, double d12) {
            this.from = d11;
            this.to = d12;
        }

        public double getFrom() {
            return this.from;
        }

        public double getTo() {
            return this.to;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.from = archive.add(this.from);
            this.to = archive.add(this.to);
        }

        public RangeValue() {
        }
    }

    public static class EnumValue implements Serializable {
        private Boolean disabled;
        private boolean disabled__is_initialized;
        private NativeObject nativeObject;
        private Boolean selected;
        private boolean selected__is_initialized;
        private Feature.FeatureEnumValue value;
        private boolean value__is_initialized;

        public EnumValue() {
            this.value__is_initialized = false;
            this.selected__is_initialized = false;
            this.disabled__is_initialized = false;
        }

        private native Boolean getDisabled__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::BusinessFilter::EnumValue";
        }

        private native Boolean getSelected__Native();

        private native Feature.FeatureEnumValue getValue__Native();

        private native NativeObject init(Feature.FeatureEnumValue featureEnumValue, Boolean bool, Boolean bool2);

        public synchronized Boolean getDisabled() {
            try {
                if (!this.disabled__is_initialized) {
                    this.disabled = getDisabled__Native();
                    this.disabled__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.disabled;
        }

        public synchronized Boolean getSelected() {
            try {
                if (!this.selected__is_initialized) {
                    this.selected = getSelected__Native();
                    this.selected__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.selected;
        }

        @NonNull
        public synchronized Feature.FeatureEnumValue getValue() {
            try {
                if (!this.value__is_initialized) {
                    this.value = getValue__Native();
                    this.value__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.value;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add((Archive) getValue(), false, (Class<Archive>) Feature.FeatureEnumValue.class);
                archive.add(getSelected(), true);
                archive.add(getDisabled(), true);
                return;
            }
            this.value = (Feature.FeatureEnumValue) archive.add((Archive) this.value, false, (Class<Archive>) Feature.FeatureEnumValue.class);
            this.value__is_initialized = true;
            this.selected = archive.add(this.selected, true);
            this.selected__is_initialized = true;
            Boolean add = archive.add(this.disabled, true);
            this.disabled = add;
            this.disabled__is_initialized = true;
            this.nativeObject = init(this.value, this.selected, add);
        }

        public EnumValue(@NonNull Feature.FeatureEnumValue featureEnumValue, Boolean bool, Boolean bool2) {
            this.value__is_initialized = false;
            this.selected__is_initialized = false;
            this.disabled__is_initialized = false;
            if (featureEnumValue != null) {
                this.nativeObject = init(featureEnumValue, bool, bool2);
                this.value = featureEnumValue;
                this.value__is_initialized = true;
                this.selected = bool;
                this.selected__is_initialized = true;
                this.disabled = bool2;
                this.disabled__is_initialized = true;
                return;
            }
            throw new IllegalArgumentException("Required field \"value\" cannot be null");
        }

        private EnumValue(NativeObject nativeObject) {
            this.value__is_initialized = false;
            this.selected__is_initialized = false;
            this.disabled__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public BusinessFilter(@NonNull String str, String str2, Boolean bool, Image image, Image image2, Image image3, Image image4, Boolean bool2, @NonNull Values values) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.disabled__is_initialized = false;
        this.iconLight__is_initialized = false;
        this.iconDark__is_initialized = false;
        this.iconAfterLight__is_initialized = false;
        this.iconAfterDark__is_initialized = false;
        this.singleSelect__is_initialized = false;
        this.values__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (values != null) {
            this.nativeObject = init(str, str2, bool, image, image2, image3, image4, bool2, values);
            this.f60737id = str;
            this.id__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.disabled = bool;
            this.disabled__is_initialized = true;
            this.iconLight = image;
            this.iconLight__is_initialized = true;
            this.iconDark = image2;
            this.iconDark__is_initialized = true;
            this.iconAfterLight = image3;
            this.iconAfterLight__is_initialized = true;
            this.iconAfterDark = image4;
            this.iconAfterDark__is_initialized = true;
            this.singleSelect = bool2;
            this.singleSelect__is_initialized = true;
            this.values = values;
            this.values__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"values\" cannot be null");
    }

    private BusinessFilter(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.disabled__is_initialized = false;
        this.iconLight__is_initialized = false;
        this.iconDark__is_initialized = false;
        this.iconAfterLight__is_initialized = false;
        this.iconAfterDark__is_initialized = false;
        this.singleSelect__is_initialized = false;
        this.values__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
