package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class IDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<IDeviceInfo> CREATOR = new Parcelable.Creator<IDeviceInfo>() { // from class: org.chromium.base.IDeviceInfo.1
        @Override // android.os.Parcelable.Creator
        public IDeviceInfo createFromParcel(Parcel _aidl_source) {
            IDeviceInfo iDeviceInfo = new IDeviceInfo();
            iDeviceInfo.readFromParcel(_aidl_source);
            return iDeviceInfo;
        }

        @Override // android.os.Parcelable.Creator
        public IDeviceInfo[] newArray(int _aidl_size) {
            return new IDeviceInfo[_aidl_size];
        }
    };
    public String gmsVersionCode;
    public boolean isAutomotive = false;
    public boolean isDesktop = false;
    public boolean isFoldable = false;
    public boolean isTv = false;
    public int vulkanDeqpLevel = 0;
    public boolean isXr = false;
    public boolean wasLaunchedOnLargeDisplay = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.gmsVersionCode);
        parcel.writeInt(this.isAutomotive ? 1 : 0);
        parcel.writeInt(this.isDesktop ? 1 : 0);
        parcel.writeInt(this.isFoldable ? 1 : 0);
        parcel.writeInt(this.isTv ? 1 : 0);
        parcel.writeInt(this.vulkanDeqpLevel);
        parcel.writeInt(this.isXr ? 1 : 0);
        parcel.writeInt(this.wasLaunchedOnLargeDisplay ? 1 : 0);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }

    public final void readFromParcel(Parcel _aidl_parcel) {
        int dataPosition = _aidl_parcel.dataPosition();
        int readInt = _aidl_parcel.readInt();
        try {
            if (readInt < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                this.gmsVersionCode = _aidl_parcel.readString();
                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                    boolean z = true;
                    this.isAutomotive = _aidl_parcel.readInt() != 0;
                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                        this.isDesktop = _aidl_parcel.readInt() != 0;
                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                            this.isFoldable = _aidl_parcel.readInt() != 0;
                            if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                this.isTv = _aidl_parcel.readInt() != 0;
                                if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                    this.vulkanDeqpLevel = _aidl_parcel.readInt();
                                    if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                        this.isXr = _aidl_parcel.readInt() != 0;
                                        if (_aidl_parcel.dataPosition() - dataPosition < readInt) {
                                            if (_aidl_parcel.readInt() == 0) {
                                                z = false;
                                            }
                                            this.wasLaunchedOnLargeDisplay = z;
                                            if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            _aidl_parcel.setDataPosition(dataPosition + readInt);
        } catch (Throwable th) {
            if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            _aidl_parcel.setDataPosition(dataPosition + readInt);
            throw th;
        }
    }
}
