package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class IDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<IDeviceInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f78497a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f78498b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f78499c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f78500d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78501e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f78502f = 0;

    final class a implements Parcelable.Creator<IDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        public final IDeviceInfo createFromParcel(Parcel parcel) {
            IDeviceInfo iDeviceInfo = new IDeviceInfo();
            int dataPosition = parcel.dataPosition();
            int readInt = parcel.readInt();
            try {
                if (readInt < 4) {
                    throw new BadParcelableException("Parcelable too small");
                }
                if (parcel.dataPosition() - dataPosition < readInt) {
                    iDeviceInfo.f78497a = parcel.readString();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        iDeviceInfo.f78498b = parcel.readInt() != 0;
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            iDeviceInfo.f78499c = parcel.readInt() != 0;
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                iDeviceInfo.f78500d = parcel.readInt() != 0;
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    iDeviceInfo.f78501e = parcel.readInt() != 0;
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        iDeviceInfo.f78502f = parcel.readInt();
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
                parcel.setDataPosition(dataPosition + readInt);
                return iDeviceInfo;
            } catch (Throwable th2) {
                if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(dataPosition + readInt);
                throw th2;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final IDeviceInfo[] newArray(int i11) {
            return new IDeviceInfo[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.f78497a);
        parcel.writeInt(this.f78498b ? 1 : 0);
        parcel.writeInt(this.f78499c ? 1 : 0);
        parcel.writeInt(this.f78500d ? 1 : 0);
        parcel.writeInt(this.f78501e ? 1 : 0);
        parcel.writeInt(this.f78502f);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
